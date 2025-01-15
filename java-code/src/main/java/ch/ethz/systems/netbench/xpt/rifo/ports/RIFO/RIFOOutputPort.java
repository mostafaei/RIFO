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

    //Control the rank range
    private int rankRange;
    private boolean isServer;


    RIFOOutputPort(NetworkDevice ownNetworkDevice, NetworkDevice targetNetworkDevice, Link link, long maxQueueSize, int rankRange, float kValue) {
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

        this.count = 0;

        this.avgqlen = 0;
        this.avgcount = 0;

        // qlen is the "C" in the algorithm (maximum number of packets we can put into the queue)
        // ignore "this.maxQueueSize"
        //this.qlen = 1000.0f;
        this.qlen = maxQueueSize;

        this.rankRange = rankRange;
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
            this.avgcount = this.avgcount + 1;
            this.avgqlen = this.avgqlen + buffQueue.size();

            //select the rank of the first packet if the rifoRank is zero
            if(rank>maxRank) {
                maxRank = rank;
            }
            else if(rank<minRank) {
                minRank=rank;

            }
	     if(rank==0 )
            {
                rifoRank=0;
            }
            else {
                rifoRank = (double) (rank-minRank) / (maxRank - minRank);
            }

            double qRank=(this.qlen - buffQueue.size()) / this.qlen;
            this.count = this.count + 1;
            if (this.count == this.rankRange) {
                this.count = 0;
                maxRank=Integer.MIN_VALUE;
                minRank=Integer.MAX_VALUE;
            }

            if ( (buffQueue.size() <= k*this.qlen)  || rifoRank<=(qRank) ) {

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
}
