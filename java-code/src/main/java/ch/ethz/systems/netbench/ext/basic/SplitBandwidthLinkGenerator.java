package ch.ethz.systems.netbench.ext.basic;

import ch.ethz.systems.netbench.core.log.SimulationLogger;
import ch.ethz.systems.netbench.core.network.Link;
import ch.ethz.systems.netbench.core.network.NetworkDevice;
import ch.ethz.systems.netbench.core.run.infrastructure.LinkGenerator;

/*Class by Albert Gran to describe different bandwidth links in Leaf-Spine Topology*/

/* Access links are of 10Gbps and leaf-spine links are 40Gbps. Remember that the difference between servers and switches
* is that switches don't have transport layer.*/

public class SplitBandwidthLinkGenerator extends LinkGenerator {

    private final long delayNs;
    private final long bandwidthBitPerNs;

    public SplitBandwidthLinkGenerator(long delayNs, long bandwidthBitPerNs) {
        this.delayNs = delayNs;
        this.bandwidthBitPerNs = bandwidthBitPerNs;
        SimulationLogger.logInfo("Link", "PERFECT_SIMPLE_LINK(delayNs=" + delayNs + ", bandwidthBitPerNs=" + bandwidthBitPerNs + ")");
    }

    @Override
    public Link generate(NetworkDevice fromNetworkDevice, NetworkDevice toNetworkDevice) {
        long delayNs_rtt = delayNs;
        if (fromNetworkDevice.isServer() || toNetworkDevice.isServer()) {
            return new PerfectSimpleLink(delayNs_rtt, this.bandwidthBitPerNs);
            // TODO: CHANGE BACK to 1&4
            // return new PerfectSimpleLink(delayNs, 1);
        } else {
            return new PerfectSimpleLink(delayNs_rtt, 4 * this.bandwidthBitPerNs);
            // TODO: CHANGE BACK to 1&4
            // return new PerfectSimpleLink(delayNs, 4);
        }

    }

}
