package ch.ethz.systems.netbench.core.run;

public class MainFigure9 {
    /*
     * Figure 9 Simulation results of web search workload to minimize FCT.
     * Result data are stored in java-code/project/rifo/plots/rifo_evaluation/pFabric/web_search_workload_T.
     * Since we are doing 100G/400G, overwrite traffice_lambda_flow_starts_per_s and link_bandwidth_bit_per_ns
     * to original_lambda*100 and 100 respectively.
     */

    public static void main(String args[]) {

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/3600/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/3600/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/5200/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/5200/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/7000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/7000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/8900/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/8900/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/11100/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/11100/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/14150/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/14150/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/19000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/19000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/3600/RIFO_SC30.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "sample_count=30", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/5200/RIFO_SC30.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "sample_count=30", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/7000/RIFO_SC30.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000",  "sample_count=30", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/8900/RIFO_SC30.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000",  "sample_count=30", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/11100/RIFO_SC30.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "sample_count=30", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/14150/RIFO_SC30.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000",  "sample_count=30", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/19000/RIFO_SC30.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "sample_count=30", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/3600/RIFO_SC100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "sample_count=100", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/5200/RIFO_SC100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "sample_count=100", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/7000/RIFO_SC100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000",  "sample_count=100", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/8900/RIFO_SC100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000",  "sample_count=100", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/11100/RIFO_SC100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "sample_count=100", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/14150/RIFO_SC100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000",  "sample_count=100", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/19000/RIFO_SC100.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "sample_count=100", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/3600/RIFO_SC500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/5200/RIFO_SC500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/7000/RIFO_SC500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000",  "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/8900/RIFO_SC500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000",  "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/11100/RIFO_SC500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/14150/RIFO_SC500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000",  "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/19000/RIFO_SC500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/3600/RIFO_SC1000.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "sample_count=1000", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/5200/RIFO_SC1000.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "sample_count=1000", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/7000/RIFO_SC1000.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000",  "sample_count=1000", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/8900/RIFO_SC1000.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000",  "sample_count=1000", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/11100/RIFO_SC1000.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "sample_count=1000", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/14150/RIFO_SC1000.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000",  "sample_count=1000", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_T/19000/RIFO_SC1000.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "sample_count=1000", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});




        /* Analyze and plot */
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/pFabric/web_search_workload_T/analyze.py", true);
    }
}
