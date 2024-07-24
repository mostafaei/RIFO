package ch.ethz.systems.netbench.core.run;

public class MainFigure8 {
        /*
     * Figure 7 Simulation results of data mining workload to minimize FCT.
     * Result data are stored in java-code/project/rifo/plots/rifo_evaluation/pFabric/data_mining_workload.
     * Since we are doing 100G/400G, overwrite traffice_lambda_flow_starts_per_s and link_bandwidth_bit_per_ns
     * to original_lambda*100 and 100 respectively.
     */
    public static void main(String args[]) {

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=400000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1000000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
       MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1500000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
       MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=2250000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=3700000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=6000000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=400000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1000000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1500000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=2250000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=3700000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=6000000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=400000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=400000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=400000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=400000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1500000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1500000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1500000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1500000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=2250000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=2250000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=2250000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=2250000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=3700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=3700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=3700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=3700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=6000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=6000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=6000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=6000000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        /* Analyze and plot */
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/pFabric/data_mining_workload/analyze.py", true);
        MainFromProperties.runCommand("pyhon3 projects/rifo/plots/rifo_evaluation/pFabric/data_mining_workload/analyze_throughput.py", true);
    }
}
