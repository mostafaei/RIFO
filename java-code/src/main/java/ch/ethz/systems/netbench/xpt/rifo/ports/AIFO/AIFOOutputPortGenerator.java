package ch.ethz.systems.netbench.xpt.rifo.ports.AIFO;

import ch.ethz.systems.netbench.core.network.Link;
import ch.ethz.systems.netbench.core.network.NetworkDevice;
import ch.ethz.systems.netbench.core.network.OutputPort;
import ch.ethz.systems.netbench.core.run.infrastructure.OutputPortGenerator;

public class AIFOOutputPortGenerator extends OutputPortGenerator {

    private final long maxQueueSize;
    private final int windowSize;

    private final int rankRange;
    private final float kValue;

    public AIFOOutputPortGenerator(long maxQueueSize, int windowSize, int rankRange, float kValue) {
        this.maxQueueSize = maxQueueSize;
        this.windowSize = windowSize;
        this.rankRange = rankRange;
        this.kValue = kValue;
    }

    @Override
    public OutputPort generate(NetworkDevice ownNetworkDevice, NetworkDevice towardsNetworkDevice, Link link) {
        return new AIFOOutputPort(ownNetworkDevice, towardsNetworkDevice, link, maxQueueSize, windowSize, rankRange, kValue);
    }
}
