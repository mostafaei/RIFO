package ch.ethz.systems.netbench.core.run;

public class MainFigure9 {
    /*
     * Figure 10 Simulation results of web search workload to check the effect of queue size on the FCT and throughput of flows.
     * Since we are doing 100G/400G, overwrite traffice_lambda_flow_starts_per_s and link_bandwidth_bit_per_ns
     * to original_lambda*100 and 100 respectively.
     */

    public static void main(String args[]) {

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "rank_range=500", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "rank_range=500", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "rank_range=500", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "rank_range=500", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "rank_range=500", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "rank_range=500", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B10.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "rank_range=500", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B20.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "rank_range=500", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "rank_range=500", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "rank_range=500", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "rank_range=500", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "rank_range=500", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "rank_range=500", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B50.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "rank_range=500", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});



        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "rank_range=500", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "rank_range=500", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "rank_range=500", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "rank_range=500", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "rank_range=500", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "rank_range=500", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B100.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "rank_range=500", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});




        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "rank_range=500", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "rank_range=500", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "rank_range=500", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "rank_range=500", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "rank_range=500", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14151/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "rank_range=500", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B500.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "rank_range=500", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "k_value=0.1"});


	/* AIFO experiments for queue lenqth */



	MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/AIFO_C50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "window_size=20", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/AIFO_C50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "window_size=20", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/AIFO_C50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "window_size=20", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/AIFO_C50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "window_size=20", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/AIFO_C50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "window_size=20", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/AIFO_C50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "window_size=20", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/AIFO_C50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "window_size=20", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/AIFO_C100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "window_size=20", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/AIFO_C100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "window_size=20", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/AIFO_C100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "window_size=20", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/AIFO_C100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "window_size=20", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/AIFO_C100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "window_size=20", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/AIFO_C100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "window_size=20", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/AIFO_C100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "window_size=20", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});



        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/AIFO_C500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "window_size=20", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/AIFO_C500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "window_size=20", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/AIFO_C500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "window_size=20", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/AIFO_C500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "window_size=20", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/AIFO_C500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "window_size=20", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/AIFO_C500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "window_size=20", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/AIFO_C500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "window_size=20", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=100", "sample_count=15", "k_value=0.1"});


        /* Analyze and plot */
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/pFabric/web_search_workload_q_len/analyze.py", true);
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/pFabric/web_search_workload_q_len/analyze_throughput.py", true);
    }
}

