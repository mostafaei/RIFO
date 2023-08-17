package ch.ethz.systems.netbench.xpt.rifo.ports.RIFO;
import ch.ethz.systems.netbench.core.log.SimulationLogger;
import ch.ethz.systems.netbench.core.network.Link;
import ch.ethz.systems.netbench.core.network.NetworkDevice;
import ch.ethz.systems.netbench.core.network.OutputPort;
import ch.ethz.systems.netbench.core.network.Packet;
import ch.ethz.systems.netbench.ext.basic.IpHeader;
import ch.ethz.systems.netbench.xpt.tcpbase.PriorityHeader;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import ch.ethz.systems.netbench.xpt.tcpbase.FullExtTcpPacket;

public class RIFOOutputPort extends OutputPort {
    private final long maxQueueSize;
    //private int windowSize;

    private Lock reentrantLock;

    private float k;
    private int maxRank=Integer.MIN_VALUE , minRank=Integer.MAX_VALUE;
    private double rifoRank;


    private Queue qWindow;

    private int count;
    private double avgqlen;
    private double avgcount;

    private double qlen;

    //Control the sample rate
    private int sampleCount;
    private boolean isServer;


    RIFOOutputPort(NetworkDevice ownNetworkDevice, NetworkDevice targetNetworkDevice, Link link, long maxQueueSize, int sampleCount, float kValue) {
        super(ownNetworkDevice, targetNetworkDevice, link, new LinkedBlockingQueue<Packet>());
        //super(ownNetworkDevice, targetNetworkDevice, link, new WFQAIFOOutputQueue<Packet>());
        // ignore this maxQueueSize
        this.isServer = ownNetworkDevice.isServer();
        this.maxQueueSize = maxQueueSize;
        //this.windowSize = windowSize;
        this.reentrantLock = new ReentrantLock();
        // ** k is set as 0.1 here, can be changed e.g., among [0.1, 0.5]
        //this.k = 0.1f;
        this.k = kValue;
        maxRank = 0;
        rifoRank = 0;

        // we define three linked List: qWindow, qWindowMice, and qWindowElephant
        this.qWindow = new LinkedList(); // the original window
        // window to put the packets of short flows
//        this.qWindowMice = new LinkedList();
//        // window to put the packets of elephant flows
//        this.qWindowElephant = new LinkedList();
        this.count = 0;

        // avgqlen and avgcount are used for analysis
        this.avgqlen = 0;
        this.avgcount = 0;

        // qlen is the "C" in the algorithm (maximum number of packets we can put into the queue)
        // ignore "this.maxQueueSize"
        //this.qlen = 1000.0f;
        this.qlen = maxQueueSize;

        this.sampleCount = sampleCount;
//        this.sampleCount = 1;
        //this.qlen = 100;
    }

    @Override
    public void enqueue(Packet packet) {
        // Convert to IP packet
        PriorityHeader header = (PriorityHeader) packet;

        this.reentrantLock.lock();
        try {
//            if (this.getOwnId() == 10) {
//                System.out.println(this.getTargetId());
//            if (this.isServer) {
//                IpHeader ipHeader = (IpHeader) packet;
//                // if (getBufferOccupiedBits() + ipHeader.getSizeBit() <= 146000) {
//                if (buffQueue.size() + 1 <= 20) {
//                    guaranteedEnqueue(packet);
//                } else {
//                    SimulationLogger.increaseStatisticCounter("PACKETS_DROPPED");
//                    if (ipHeader.getSourceId() == this.getOwnId()) {
//                        SimulationLogger.increaseStatisticCounter("PACKETS_DROPPED_AT_SOURCE");
//                    }
//                }
//                return;
//            }

            Integer rank = (int) header.getPriority();
//            System.out.println("packet rank: "+rank.toString()+" rifoRank="+rifoRank);
            // ** (total) length of the queue

            this.avgcount = this.avgcount + 1;
            this.avgqlen = this.avgqlen + buffQueue.size();

//            boolean admit_flag;

            //select the rank of the first packet if the rifoRank is zero
            if(rank>maxRank) {
                maxRank = rank;
            }
            else if(rank<minRank) {
                minRank=rank;

            }

            rifoRank=(double) (maxRank-rank)/(maxRank-minRank);
            double avgRank=(maxRank+minRank)/2.0;
//            rifoRank=findRank(rank);

            double qRank=(this.qlen - buffQueue.size()) / this.qlen;
//            System.out.println("rank = "+rank +" MAX: "+maxRank+" Min: " +minRank+ " avgRank=  "+avgRank +" RIFO: "+rifoRank+ " qRank: "+qRank);
//            System.out.println("buff "+buffQueue.size() + "    k*qlen: " +k*this.qlen);
            this.count = this.count + 1;
//            System.out.println("qWindow = "+qWindow.size()+" this.count: "+this.count + "  this.avgqlen "+ this.avgqlen );
            if (this.count == this.sampleCount) {
                this.count = 0;
                maxRank=Integer.MIN_VALUE;
                minRank=Integer.MAX_VALUE;
//                System.out.println("************* reset this.count ***************");
            }
            // Marko's comments
//            rifoRank=(double) (rank)/(maxRank-minRank);
//            qRank=(buffQueue.size()) / this.qlen;
//            if ((qRank<=k)  || (qRank>=rifoRank )) {
//            if ((rifoRank>=0.9)  || (rifoRank<=qRank )) {
            //Marko's comments

//            if ((buffQueue.size() <= k*this.qlen)  || (rifoRank>=(qRank) )) {
            if ( (buffQueue.size() <= k*this.qlen)  || rifoRank>=(qRank) ) {

                IpHeader ipHeader = (IpHeader) packet;

                if (buffQueue.size() + 1 <= this.qlen) {

                    // Check whether there is an inversion for the packet enqueued
                    /*if (SimulationLogger.hasInversionsTrackingEnabled()){

                        // Extract the packet rank
                        FullExtTcpPacket p = (FullExtTcpPacket) packet;

                        // We compute the perceived rank
                        Object[] contentPIFO = super.getQueue().toArray();
                        if (contentPIFO.length > 0) {
                            Arrays.sort(contentPIFO);
                            FullExtTcpPacket packet_maxrank = (FullExtTcpPacket) contentPIFO[contentPIFO.length-1];
                            int rank_perceived = (int)packet_maxrank.getPriority();

                            // We measure the inversion
                            if (rank_perceived > p.getPriority()){
                                SimulationLogger.logInversionsPerRank(this.getOwnId(), (int) p.getPriority(), 1);
                            }
                        }
                    }*/

                    // Check whether there is an inversion for the packet enqueued (count)
                    if (SimulationLogger.hasInversionsTrackingEnabled()) {

                        // Extract the packet rank
                        FullExtTcpPacket p = (FullExtTcpPacket) packet;

                        // We compute the perceived rank
                        Object[] contentPIFO = super.getQueue().toArray();
                        int inversion_count = 0;
                        if (contentPIFO.length > 0) {
                            for (int j = 0; j < contentPIFO.length; j++) {
                                int r = (int) ((FullExtTcpPacket) contentPIFO[j]).getPriority();
                                if (r > p.getPriority()) {
                                    inversion_count ++;
                                }
                            }
                            if (inversion_count != 0) {
                                SimulationLogger.logInversionsPerRank(this.getOwnId(), (int) p.getPriority(), inversion_count);
                            }
                        }
                    }


                    guaranteedEnqueue(packet);
                }

                else {
                    SimulationLogger.increaseStatisticCounter("PACKETS_DROPPED");
                    if (ipHeader.getSourceId() == this.getOwnId()) {
                        SimulationLogger.increaseStatisticCounter("PACKETS_DROPPED_AT_SOURCE");
                    }
                }
            }
            else {
                SimulationLogger.increaseStatisticCounter("PACKETS_DROPPED");
                IpHeader ipHeader = (IpHeader) packet;
                if (ipHeader.getSourceId() == this.getOwnId()) {
                    SimulationLogger.increaseStatisticCounter("PACKETS_DROPPED_AT_SOURCE");
                }
            }
        } finally {
            this.reentrantLock.unlock();
        }
    }

        public double findRank(int priority) {
            if (qWindow.size() == 0)
                return 1.0;
            Object[] contentPIFO = qWindow.toArray();
            double RIFOpr = 0;
            double maxR = Double.NEGATIVE_INFINITY;
            double minR = Double.POSITIVE_INFINITY;
            for (int i = 0; i < contentPIFO.length; i++) {
                FullExtTcpPacket packet = (FullExtTcpPacket) contentPIFO[(int) i];
                long packetRank = packet.getPriority();
                if (packetRank < minR)
                    minR = packetRank;
                else if (packetRank > maxR)
                    maxR = packetRank;
            }
            RIFOpr = (maxR - priority) / (maxR - minR);
            return RIFOpr;
        }

//    public boolean compareQuantile(int priority, double quantile) {
//        if (qWindow.size() == 0)
//            return true;
//        Object[] contentPIFO = qWindow.toArray();
//        int count = 0;
//        for (int i =0; i<contentPIFO.length; i++) {
//            FullExtTcpPacket packet = (FullExtTcpPacket) contentPIFO[(int) i];
//            if (priority > packet.getPriority())
//                count += 1;
//        }
//        if (count * 1.0  < quantile * qWindow.size())
//            return true;
//        return false;
////        Arrays.sort(contentPIFO);
////
////        //FullExtTcpPacket packet = (FullExtTcpPacket) contentPIFO[(int) (qWindow.size() * quantile)];
////        FullExtTcpPacket packet;
////        try {
////            packet = (FullExtTcpPacket) contentPIFO[(int) (qWindow.size() * quantile)];
////        }
////        // quantile == 1
////        catch(ArrayIndexOutOfBoundsException e) {
////            packet = (FullExtTcpPacket) contentPIFO[(int) (qWindow.size() - 1)];
////        }
////
////        if (priority <= packet.getPriority())
////            return true;
////        return false;
//    }
}
