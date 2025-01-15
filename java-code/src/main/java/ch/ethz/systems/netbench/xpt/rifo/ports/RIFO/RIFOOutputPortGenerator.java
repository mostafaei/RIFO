package ch.ethz.systems.netbench.xpt.rifo.ports.RIFO;

import ch.ethz.systems.netbench.core.network.Link;
import ch.ethz.systems.netbench.core.network.NetworkDevice;
import ch.ethz.systems.netbench.core.network.OutputPort;
import ch.ethz.systems.netbench.core.run.infrastructure.OutputPortGenerator;

public class RIFOOutputPortGenerator extends OutputPortGenerator {
    private final long maxQueueSize;
//    private final int windowSize;

    private final int rankRange;
    private final float kValue;

    public RIFOOutputPortGenerator(long maxQueueSize, int rankRange, float kValue) {
        this.maxQueueSize = maxQueueSize;
        this.rankRange = rankRange;
        this.kValue = kValue;
    }

    @Override
    public OutputPort generate(NetworkDevice ownNetworkDevice, NetworkDevice towardsNetworkDevice, Link link) {
        return new RIFOOutputPort(ownNetworkDevice, towardsNetworkDevice, link, maxQueueSize, rankRange, kValue);
    }
}
