package ch.ethz.systems.netbench.core.run;

public class MainFigure8 {
    public static void main(String args[]) {

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=40000", "sample_count=150", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=60000", "sample_count=150", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=100000", "sample_count=150", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=150000", "sample_count=150", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=225000", "sample_count=150", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=370000", "sample_count=200", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.5"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "sample_count=150", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=40000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=60000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=100000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=150000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=225000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=370000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=40000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=40000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=40000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/4000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=40000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=60000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=60000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=60000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/6000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=60000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=100000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=100000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=100000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/10000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=100000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=150000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=150000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=150000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/15000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=150000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=225000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=225000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=225000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/22500/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=225000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=370000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=370000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=370000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/37000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=370000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/data_mining_workload/60000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=600000", "link_bandwidth_bit_per_ns=10", "enable_inversions_tracking=false"});

        /* Analyze and plot */
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/pFabric/data_mining_workload/analyze.py", true);
    }
}
