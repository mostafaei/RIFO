package ch.ethz.systems.netbench.core.run;

public class MainFigure7 {
    /*
     * Figure 6 Simulation results of web search workload to minimize FCT.
     * Result data are stored in java-code/project/rifo/plots/rifo_evaluation/pFabric/web_search_workload.
     * Since we are doing 100G/400G, overwrite traffice_lambda_flow_starts_per_s and link_bandwidth_bit_per_ns
     * to original_lambda*100 and 100 respectively.
     */

    public static void main(String args[]) {

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/3600/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/5200/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/7000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/8900/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/11100/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000","sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/14150/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000","sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/19000/RIFO.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000","sample_count=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/3600/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/5200/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/7000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/8900/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/11100/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/14150/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/19000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/3600/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/3600/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/3600/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/3600/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});



        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/5200/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/5200/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/5200/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/5200/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/7000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/7000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/7000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/7000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/8900/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/8900/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/8900/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/8900/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/11100/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/11100/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/11100/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/11100/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/14150/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/14150/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/14150/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/14150/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/19000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/19000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/19000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload/19000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100", "enable_inversions_tracking=false"});

        /* Analyze and plot */
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/pFabric/web_search_workload/analyze.py", true);
        MainFromProperties.runCommand("pyhon3 projects/rifo/plots/rifo_evaluation/pFabric/web_search_workload/analyze_throughput.py", true);
         
    }
}
