package ch.ethz.systems.netbench.xpt.rifo.ports.RIFO_WFQ;

import ch.ethz.systems.netbench.core.network.Link;
import ch.ethz.systems.netbench.core.network.NetworkDevice;
import ch.ethz.systems.netbench.core.network.OutputPort;
import ch.ethz.systems.netbench.core.run.infrastructure.OutputPortGenerator;

public class WFQRIFOOutputPortGenerator extends OutputPortGenerator {
    private final long maxQueueSize;
//    private final int windowSize;

    private final int sampleCount;
    private final float kValue;

    public WFQRIFOOutputPortGenerator(long maxQueueSize, int sampleCount, float kValue) {
        this.maxQueueSize = maxQueueSize;
//        this.windowSize = windowSize;
        this.sampleCount = sampleCount;
        this.kValue = kValue;
    }

    @Override
    public OutputPort generate(NetworkDevice ownNetworkDevice, NetworkDevice towardsNetworkDevice, Link link) {
        return new WFQRIFOOutputPort(ownNetworkDevice, towardsNetworkDevice, link, maxQueueSize, sampleCount, kValue);
    }
}
