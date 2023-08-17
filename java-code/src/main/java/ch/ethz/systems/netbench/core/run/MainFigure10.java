package ch.ethz.systems.netbench.core.run;

public class MainFigure10 {
    /*
     * Figure 10 Simulation results of web search workload to check the effect of queue size on the FCT and throughput of flows.
     * Since we are doing 10G/40G, overwrite traffice_lambda_flow_starts_per_s and link_bandwidth_bit_per_ns
     * to original_lambda*10 and 10 respectively.
     */

    public static void main(String args[]) {

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=36000", "sample_count=50", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=52000", "sample_count=50", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=70000", "sample_count=50", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=89000", "sample_count=50", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=111000", "sample_count=50", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B10.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=141500", "sample_count=50", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B10.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=190000", "sample_count=50", "output_port_max_size_packets=10", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=36000", "sample_count=50", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=52000", "sample_count=50", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=70000", "sample_count=50", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=89000", "sample_count=50", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=111000", "sample_count=50", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B20.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=141500", "sample_count=50", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B20.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=190000", "sample_count=50", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=36000", "sample_count=50", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=52000", "sample_count=50", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=70000", "sample_count=50", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=89000", "sample_count=50", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=111000", "sample_count=50", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B50.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=141500", "sample_count=50", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B50.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=190000", "sample_count=50", "output_port_max_size_packets=50", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});



        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=36000", "sample_count=50", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=52000", "sample_count=50", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=70000", "sample_count=50", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=89000", "sample_count=50", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=111000", "sample_count=50", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B100.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=141500", "sample_count=50", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B100.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=190000", "sample_count=50", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});




        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/3600/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=36000", "sample_count=50", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/5200/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=52000", "sample_count=50", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/7000/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=70000", "sample_count=50", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/8900/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=89000", "sample_count=50", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/11100/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=111000", "sample_count=50", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/14150/RIFO_B500.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=141500", "sample_count=50", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_q_len/19000/RIFO_B500.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=190000", "sample_count=50", "output_port_max_size_packets=500", "link_bandwidth_bit_per_ns=10", "k_value=0.1"});


        /* Analyze and plot */
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/pFabric/web_search_workload_q_len/analyze.py", true);
    }
}

