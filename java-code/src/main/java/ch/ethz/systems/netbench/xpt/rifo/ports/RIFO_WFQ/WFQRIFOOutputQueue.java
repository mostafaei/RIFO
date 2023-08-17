package ch.ethz.systems.netbench.xpt.rifo.ports.RIFO_WFQ;

import ch.ethz.systems.netbench.xpt.tcpbase.PriorityHeader;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class WFQRIFOOutputQueue<Packet> extends LinkedBlockingQueue<Packet> {
    private Lock reentrantLock;
    private int round;

    public WFQRIFOOutputQueue(){
        super();
        round = 0;
        this.reentrantLock = new ReentrantLock();
    }

    /*Round is the virtual start time of the last dequeued packet across all flows*/
    public void updateRound(Packet p){
        PriorityHeader header = (PriorityHeader) p;
        int rank = (int)header.getPriority();
        this.round = rank;
    }

    @Override
    public Packet poll() {
        this.reentrantLock.lock();
        try {
            Packet packet = super.poll();
            this.updateRound(packet);
            return packet;

        } finally {
            this.reentrantLock.unlock();
        }
    }

    public int getRound() {
        return this.round;
    }

}
