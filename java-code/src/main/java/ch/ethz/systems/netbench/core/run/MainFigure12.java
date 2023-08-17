package ch.ethz.systems.netbench.core.run;

public class MainFigure12 {
    /*
     * Figure 12 Simulation results of web search workload with fair queueing.
     * Result data are stored in java-code/project/rifo/plots/rifo_evaluation/pFabric/web_search_workload.
     * Since we are doing 10G/40G, overwrite traffice_lambda_flow_starts_per_s and link_bandwidth_bit_per_ns
     * to original_lambda*10 and 10 respectively.
     */

    public static void main(String args[]) {


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/3600/RIFOWFQ.properties"
                , "second_transport_layer=udp", "sample_count=150", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/5200/RIFOWFQ.properties"
                , "second_transport_layer=udp",  "sample_count=150", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/7000/RIFOWFQ.properties"
                , "second_transport_layer=udp",  "sample_count=150", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/8900/RIFOWFQ.properties"
                , "second_transport_layer=udp",  "sample_count=150", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/11100/RIFOWFQ.properties"
                , "second_transport_layer=udp", "sample_count=150", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/14150/RIFOWFQ.properties"
                , "second_transport_layer=udp", "sample_count=150", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/19000/RIFOWFQ.properties"
                , "second_transport_layer=udp", "sample_count=150","output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});




        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/3600/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/5200/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/7000/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/8900/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/11100/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/14150/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/19000/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});




        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/3600/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/3600/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/3600/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/3600/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/3600/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/5200/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/5200/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/5200/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/5200/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/5200/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/7000/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/7000/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/7000/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/7000/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/7000/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/8900/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/8900/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/8900/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/8900/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/8900/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/11100/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/11100/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/11100/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/11100/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/11100/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/19000/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/19000/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/19000/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/19000/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/19000/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/14150/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/14150/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/14150/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/14150/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/fairness/web_search_workload/14150/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});


        /* Analyze and plot */
        MainFromProperties.runCommand("python projects/aifo/plots/rifo_evaluation/fairness/analyze.py", true);

    }
}
