package ch.ethz.systems.netbench.core.run;

public class MainFigure13 {

    public static void main(String args[]) {
	MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/3600/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/5200/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
       MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/7000/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000",  "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/8900/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000",  "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/11100/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/14150/RIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000",  "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/19000/RIFO.properties"
               , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "rank_range=500", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});



        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/3600/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/5200/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/7000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/8900/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/11100/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/14150/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/19000/AIFO.properties"
                , "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "window_size=20", "sample_count=15", "output_port_max_size_packets=20", "link_bandwidth_bit_per_ns=100000000", "k_value=0.1"});


	MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/3600/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/3600/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/3600/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/3600/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=360000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});



        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/5200/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/5200/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/5200/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/5200/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=520000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});


        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/7000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/7000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/7000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/7000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=700000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/8900/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/8900/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/8900/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/8900/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=890000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/11100/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/11100/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/11100/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/11100/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1110000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/14150/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/14150/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/14150/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/14150/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1415000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});

        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/19000/DCTCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/19000/TCP.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/19000/PIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});
        MainFromProperties.main(new String[]{"projects/rifo/runs/rifo_evaluation/pFabric/web_search_workload_pareto/19000/SPPIFO.properties", "second_transport_layer=udp", "traffic_lambda_flow_starts_per_s=1900000", "link_bandwidth_bit_per_ns=100000000", "enable_inversions_tracking=false"});

        /* Analyze and plot */
        MainFromProperties.runCommand("python3 projects/rifo/plots/rifo_evaluation/fairness//web_search_workload/analyze.py", true);
    }
}
