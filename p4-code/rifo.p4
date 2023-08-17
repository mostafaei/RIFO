/* -*- P4_16 -*- */

/* Start from the "apply" function to read the code with comments */

#include <core.p4>
#include <tna.p4>


/*************************************************************************
 ************* C O N S T A N T S    A N D   T Y P E S  *******************
**************************************************************************/

#define B 500
#define RIFO_PORT 5555
#define RIFOWORKER_PORT 5556
#define rank_range_threshold 150
#define shallow_buffer 9*B/10

typedef bit<8> ip_protocol_t;
const ip_protocol_t IP_PROTOCOLS_TCP = 6;
const ip_protocol_t IP_PROTOCOLS_UDP = 17;
const bit<16> ETHERTYPE_TPID = 0x8100;
const bit<16> ETHERTYPE_IPV4 = 0x0800;
const bit<16> ETHERTYPE_WORKER= 0x4321;



/* Table Sizes */
const int IPV4_HOST_SIZE = 65536;


#ifdef USE_ALPM
const int IPV4_LPM_SIZE  = 400*1024;
#else
const int IPV4_LPM_SIZE  = 12288;
#endif

const int BufferSize=64;
const int scale1=1;
const int scale2=2;
const int scale3=4;
const int scale4=8;
const int scale5=16;
const int scale6=32;
const int scale7=64;


#ifdef USE_STAGE
#define STAGE(n) @stage(n)
#else
#define STAGE(n)
#endif


typedef bit<48>   mac_addr_t;
typedef bit<32>   ipv4_addr_t;

/*************************************************************************
 ***********************  H E A D E R S  *********************************
 *************************************************************************/

/*  Define all the headers the program will recognize             */
/*  The actual sets of headers processed by each gress can differ */

/* Standard ethernet header */
header ethernet_h {
    mac_addr_t    dst_addr;
    mac_addr_t    src_addr;
    bit<16>  ether_type;
}

header ipv4_h {
    bit<4>       version;
    bit<4>       ihl;
    bit<8>       diffserv;
    bit<16>      total_len;
    bit<16>      identification;
    bit<3>       flags;
    bit<13>      frag_offset;
    bit<8>       ttl;
    bit<8>       protocol;
    bit<16>      hdr_checksum;
    ipv4_addr_t  src_addr;
    ipv4_addr_t  dst_addr;
}


header tcp_h {
    bit<16>  src_port;
    bit<16>  dst_port;
    bit<32>  seq_no;
    bit<32>  ack_no;
    bit<4>   data_offset;
    bit<4>   res;
    bit<8>   flags;
    bit<16>  window;
    bit<16>  checksum;
    bit<16>  urgent_ptr;
}

header udp_h {
    bit<16> src_port;
    bit<16> dst_port;
    bit<16> hdr_length;
    bit<16> checksum;
}

header rifoWorker_h {
    bit<16> rank;
    bit<5> qid;
    bit<19> egress_qlen;
}


header rifo_h {
    bit<16> rank;
    bit<16> 	  dividend;
    bit<16> 	  divisor;
}

/*************************************************************************
 **************  I N G R E S S   P R O C E S S I N G   *******************
 *************************************************************************/

    /***********************  H E A D E R S  ************************/


struct my_ingress_headers_t {
    ethernet_h          ethernet;
    ipv4_h              ipv4;
    tcp_h               tcp;
    udp_h               udp;
    rifo_h              rifo;
    rifoWorker_h       rifoWorker;
}

    /******  G L O B A L   I N G R E S S   M E T A D A T A  *********/

struct my_ingress_metadata_t {
    bit<19>       queue_length;
    bit<8> 	  	  tmpBuffer;
    bit<16> 	  min_pkt_rank;
    bit<16> 	  max_pkt_rank;
	bit<16> 	  tmp_max;
	bit<16> 	  tmp_min;
    bit<16> 	  dividend;
    bit<16> 	  divisor;
    bit<16> 	  dividend_scale;
    bit<16> 	  divisor_scale;
    bit<16> 	  left_side;
    bit<16> 	  right_side;
    bit<16> 	  rifo_admision;
    bit<16> 	  rank_range;

}

    /***********************  P A R S E R  **************************/

parser TofinoIngressParser(
        packet_in pkt,
        inout my_ingress_metadata_t meta,
        out ingress_intrinsic_metadata_t ig_intr_md) {
    state start {
        pkt.extract(ig_intr_md);
        transition select(ig_intr_md.resubmit_flag) {
            1 : parse_resubmit;
            0 : parse_port_metadata;
        }
    }

    state parse_resubmit {
        // Parse resubmitted packet here.
		pkt.advance(64); 
        transition accept;
    }

    state parse_port_metadata {
        pkt.advance(64);  //tofino 1 port metadata size
        transition accept;
    }
}


parser IngressParser(packet_in        pkt,
    /* User */    
    out my_ingress_headers_t          hdr,
    out my_ingress_metadata_t         meta,
    /* Intrinsic */
    out ingress_intrinsic_metadata_t  ig_intr_md)
{

	TofinoIngressParser() tofino_parser;
    state start {
        tofino_parser.apply(pkt, meta, ig_intr_md);
        transition meta_init;
    }


	/* User Metadata Initialization */
    state meta_init {
		meta.min_pkt_rank=0;
		meta.max_pkt_rank=0;
		meta.dividend=0;
		meta.divisor=0;
		meta.left_side=0;
		meta.right_side=0;
		meta.queue_length=0;
		meta.rifo_admision=0;
        transition parse_ethernet;
    }

   

    state parse_ethernet {
        pkt.extract(hdr.ethernet);
        transition select(hdr.ethernet.ether_type) {
            ETHERTYPE_IPV4 :  parse_ipv4;
            default :  accept;
        }
    }

    state parse_ipv4 {
        pkt.extract(hdr.ipv4);
        //ipv4_checksum.add(hdr.ipv4);
        //ig_intr_md.checksum_err = ipv4_checksum.verify();
        transition select(hdr.ipv4.protocol) {
            IP_PROTOCOLS_TCP : parse_tcp;
            IP_PROTOCOLS_UDP : parse_udp;
            default : accept;
        }              
    }

    state parse_tcp {
        pkt.extract(hdr.tcp);
        transition parse_rifo;

    }

	state parse_udp {
		pkt.extract(hdr.udp);
		transition select(hdr.udp.dst_port) {
			RIFO_PORT: parse_rifo;
			RIFOWORKER_PORT: parse_rifoWorker;
			default: accept;
		}
	}

 	state parse_rifo {
        pkt.extract(hdr.rifo);
        transition accept;

    }

    state parse_rifoWorker {
        pkt.extract(hdr.rifoWorker);
        transition accept;
    }

}

    /***************** M A T C H - A C T I O N  *********************/

control Ingress(
    /* User */
    inout my_ingress_headers_t                       hdr,
    inout my_ingress_metadata_t                      meta,
    /* Intrinsic */
    in    ingress_intrinsic_metadata_t               ig_intr_md,
    in    ingress_intrinsic_metadata_from_parser_t   ig_prsr_md,
    inout ingress_intrinsic_metadata_for_deparser_t  ig_dprsr_md,
    inout ingress_intrinsic_metadata_for_tm_t        ig_tm_md)
{

    action send(PortId_t port) {
        ig_tm_md.ucast_egress_port = port;
    	//hdr.rifo.dividend=meta.dividend;
    	//hdr.rifo.divisor=meta.divisor;
    }

    action drop() {
        ig_dprsr_md.drop_ctl = 1;
    }
 
    table ipv4_lpm {
        key     = { hdr.ipv4.dst_addr : exact; }
        actions = { send; drop; }
        
        default_action = send(64);
        size           = IPV4_LPM_SIZE;
    }
    
    Register<bit<16>, _>(32w1) rank_range_reg;    
        RegisterAction<bit<16>, bit<16>, bit<16>>(rank_range_reg) rank_range_reg_write = {
        void apply(inout bit<16> value, out bit<16> read_value){
			if (value == rank_range_threshold) {
		        value = 0;
				read_value = value;
			}
			else {
				value = value+ 1;
				read_value = value;
			}
        }
    };

    /* registers to track min and max values of ranks*/
    Register<bit<16>, _>(32w1) min_rank_reg;
    RegisterAction<bit<16>, _, bit<16>>(min_rank_reg) min_rank_reg_write_action = {
        void apply(inout bit<16> value, out bit<16> read_value){
			if (hdr.rifo.rank < value) 
				{
            	value = hdr.rifo.rank;
			}
			else if (value == 0)
				{
				value= hdr.rifo.rank;
			}
            read_value=value;
        }
    };
    RegisterAction<bit<16>, _, bit<16>>(min_rank_reg) min_rank_reg_reset_action = {
        void apply(inout bit<16> value, out bit<16> read_value){
			value= hdr.rifo.rank;
            read_value=value;
        }
    };
    RegisterAction<bit<16>, _, bit<16>>(min_rank_reg) min_rank_reg_read_action = {
        void apply(inout bit<16> value, out bit<16> read_value){
            read_value = value;
        }
    };


    Register<bit<16>, _>(32w1) max_rank_reg;
    RegisterAction<bit<16>, _, bit<16>>(max_rank_reg) max_rank_reg_write_action = {
        void apply(inout bit<16> value, out bit<16> read_value){
			if(hdr.rifo.rank > value)
				{
		            value = hdr.rifo.rank;
			}
            read_value=value;
        }
    };
    RegisterAction<bit<16>, _, bit<16>>(max_rank_reg) max_rank_reg_reset_action = {
        void apply(inout bit<16> value, out bit<16> read_value){
		    value = hdr.rifo.rank;
            read_value=value;
        }
    };
    RegisterAction<bit<16>, _, bit<16>>(max_rank_reg) max_rank_reg_read_action = {
        void apply(inout bit<16> value, out bit<16> read_value){
            read_value = value;
        }
    };

    /* end */


	action action_subtract_queueLength() {
			meta.tmpBuffer=(bit<8>) (BufferSize - meta.queue_length);
		}

	table subtract_queueLength {
	    actions = { action_subtract_queueLength; }
		default_action = action_subtract_queueLength();
		}


	action action_compute_dividend(){ 
		meta.dividend = meta.max_pkt_rank - hdr.rifo.rank ;
	}
	table compute_dividend{
		actions = {	action_compute_dividend;}
		default_action = action_compute_dividend();
	}
	action action_compute_divisor(){ 
		meta.divisor = meta.max_pkt_rank - meta.min_pkt_rank;
	 }
	table compute_divisor{
		actions = {	action_compute_divisor;}
		default_action = action_compute_divisor();
	}

	action do_RIFO_admission(){ 
		meta.rifo_admision = meta.right_side - meta.left_side ;
	 }
    table rifo_admission {
        actions = { do_RIFO_admission; }    
        default_action = do_RIFO_admission();
    }

	action recirculation(bit<9> port){
		ig_tm_md.ucast_egress_port = port;
	}

	action routing_decision(){
		//packet routing: for now we simply bounce back the packet.
		//any routing match-action logic should be added here.
		ig_tm_md.ucast_egress_port=68;
	}		
    table route_rifoWorker {
        actions = { routing_decision; }    
        default_action = routing_decision();
    }


    apply {
        if (hdr.ipv4.isValid()) {

			if (hdr.udp.dst_port == RIFO_PORT){
				meta.rank_range=(bit<16>)rank_range_reg_write.execute(0);
				hdr.rifoWorker.setValid();
				hdr.udp.dst_port = RIFO_PORT + 1 ;
				//hdr.rifoWorker.ether_type=ETHERTYPE_WORKER;
				hdr.rifoWorker.rank=hdr.rifo.rank;
				route_rifoWorker.apply();
				hdr.rifo.setInvalid();
				if(meta.rank_range == rank_range_threshold){
					min_rank_reg_reset_action.execute(0);
					max_rank_reg_reset_action.execute(0);
				}
			}
			else if (hdr.udp.dst_port == RIFOWORKER_PORT){
				//meta.queue_length=(bit<19>)qdepth_reg_write.execute(0);
				bit<19> tmpQlen;
				tmpQlen=hdr.rifoWorker.egress_qlen;
				meta.queue_length=tmpQlen;
				hdr.rifo.setValid(); 
				bit<16> tmpRank;
				tmpRank=hdr.rifoWorker.rank;
				hdr.rifo.rank = tmpRank;
				
				hdr.udp.dst_port = RIFO_PORT;

				hdr.rifoWorker.setInvalid();


				subtract_queueLength.apply();
				@stage(1){
				meta.min_pkt_rank = min_rank_reg_write_action.execute(0);
		        meta.max_pkt_rank = max_rank_reg_write_action.execute(0);}

				@stage(2){
				/*compute dividend and divisor*/
				//compute_dividend_divisor.apply();
				compute_divisor.apply();}
				@stage(3){
				compute_dividend.apply();
				

				if(meta.tmpBuffer == 1){
					meta.left_side = meta.divisor;
				}
				else if (meta.tmpBuffer == 2){
					meta.left_side = meta.divisor << 1;
				}
				else if (meta.tmpBuffer > 2 && meta.tmpBuffer <= 4 ){
					meta.left_side = meta.divisor << 2;
				}
				else if (meta.tmpBuffer > 4 && meta.tmpBuffer <= 8 ){
					meta.left_side = meta.divisor << 3;
				}
				else if (meta.tmpBuffer > 8 && meta.tmpBuffer <= 16 ){
					meta.left_side = meta.divisor << 4;
				}
				else if (meta.tmpBuffer > 16 && meta.tmpBuffer <= 32 ){
					meta.left_side = meta.divisor << 5;
				}
				else if (meta.tmpBuffer > 32 && meta.tmpBuffer <= 64 ){
					meta.left_side = meta.divisor << 6;
				}
				else if (meta.tmpBuffer > 64 && meta.tmpBuffer <= 128 ){
					meta.left_side = meta.divisor << 7;
				}
				else if (meta.tmpBuffer > 128 && meta.tmpBuffer <= 256 ){
					meta.left_side = meta.divisor << 8;
				}
				else if (meta.tmpBuffer > 256 && meta.tmpBuffer <= 512 ){
					meta.left_side = meta.divisor << 9;
				}
				else if (meta.tmpBuffer > 512 && meta.tmpBuffer <= 1024 ){
					meta.left_side = meta.divisor << 10;
				}

				meta.right_side = meta.dividend << 9;}


				/* check RIFO admision condition */
				//do_RIFO_admission();
				@stage(4){
				rifo_admission.apply();
				if (meta.rifo_admision < 0) {
					drop();
				}
				else {
					ipv4_lpm.apply();
				}
				}		
			}               
        }
    }
}

    /*********************  D E P A R S E R  ************************/

control IngressDeparser(packet_out pkt,
    /* User */
    inout my_ingress_headers_t                       hdr,
    in    my_ingress_metadata_t                      meta,
    /* Intrinsic */
    in    ingress_intrinsic_metadata_for_deparser_t  ig_dprsr_md)
{
    apply {
        pkt.emit(hdr);
    }
}


/*************************************************************************
 ****************  E G R E S S   P R O C E S S I N G   *******************
 *************************************************************************/

    /***********************  H E A D E R S  ************************/

struct my_egress_headers_t {
    ethernet_h          ethernet;
    ipv4_h              ipv4;
    udp_h               udp;
    rifo_h              rifo;
    rifoWorker_h       rifoWorker;
}

    /********  G L O B A L   E G R E S S   M E T A D A T A  *********/

struct my_egress_metadata_t {
	bit<19>	qSize;
}

    /***********************  P A R S E R  **************************/

parser EgressParser(packet_in        pkt,
    /* User */
    out my_egress_headers_t          hdr,
    out my_egress_metadata_t         meta,
    /* Intrinsic */
    out egress_intrinsic_metadata_t  eg_intr_md)
{
    /* This is a mandatory state, required by Tofino Architecture */
    state start {
        pkt.extract(eg_intr_md);
     	transition parse_ethernet;
    }

    state parse_ethernet {
        pkt.extract(hdr.ethernet);
        transition select(hdr.ethernet.ether_type) {
            ETHERTYPE_IPV4 :  parse_ipv4;
            default :  accept;
        }
    }

    state parse_ipv4 {
        pkt.extract(hdr.ipv4);
        transition select(hdr.ipv4.protocol) {
            IP_PROTOCOLS_UDP : parse_udp;
            default : accept;
        }              
    }

	state parse_udp {
		pkt.extract(hdr.udp);
		transition select(hdr.udp.dst_port) {
			RIFO_PORT: parse_rifo;
			RIFOWORKER_PORT: parse_rifoWorker;
			default: accept;
		}
	}
 	state parse_rifo {
        pkt.extract(hdr.rifo);
        transition accept;
    }

    state parse_rifoWorker {
        pkt.extract(hdr.rifoWorker);
        transition accept;
    }
}

    /***************** M A T C H - A C T I O N  *********************/

control Egress(
    /* User */
    inout my_egress_headers_t                          hdr,
    inout my_egress_metadata_t                         meta,
    /* Intrinsic */    
    in    egress_intrinsic_metadata_t                  eg_intr_md,
    in    egress_intrinsic_metadata_from_parser_t      eg_prsr_md,
    inout egress_intrinsic_metadata_for_deparser_t     eg_dprsr_md,
    inout egress_intrinsic_metadata_for_output_port_t  eg_oport_md)
{

    action compute_queue_size(){
		bit<19> value;
		meta.qSize=B - eg_intr_md.deq_qdepth;
	}

    action add_queue_depth(){
		hdr.rifoWorker.egress_qlen= meta.qSize;
		//hdr.rifoWorker.pkt_length=eg_intr_md.pkt_length;
	}
		
    table queue_depth {
        actions = { add_queue_depth; }    
        default_action = add_queue_depth();
    }

    apply {
		if(hdr.udp.dst_port == RIFOWORKER_PORT){
			compute_queue_size();
			queue_depth.apply();
		}
    }
}

    /*********************  D E P A R S E R  ************************/

control EgressDeparser(packet_out pkt,
    /* User */
    inout my_egress_headers_t                       hdr,
    in    my_egress_metadata_t                      meta,
    /* Intrinsic */
    in    egress_intrinsic_metadata_for_deparser_t  eg_dprsr_md)
{
    apply {
        pkt.emit(hdr);
    }
}

/************ F I N A L   P A C K A G E ******************************/
Pipeline(
    IngressParser(),
    Ingress(),
    IngressDeparser(),
    EgressParser(),
    Egress(),
    EgressDeparser()
) pipe;

Switch(pipe) main;  

