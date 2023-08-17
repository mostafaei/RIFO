function [ cdf ] = locality_xpander( mat, servers_per_tor, tors )
    N = size(tors,2);
    disp(N);
    ttl_servers = N*servers_per_tor;
    ttl_servers = 50;
    cdf = zeros([ttl_servers 1]);
    sp_mat = sparse(mat);
    longest = graphallshortestpaths(sp_mat,'directed',false);
    diam = get_diameter(mat);
    for srv = 1:ttl_servers
       [nodes, servers] = get_nodes_xpander(mat, srv,servers_per_tor);
       cdf(srv) = get_avg_path(longest, nodes, servers ) ;  
    end
end

function [nodes, vals] = get_nodes_xpander(mat, num_servers, servers_per_tor)
   cur_node = 1;
   nodes = 1:1;
   while length(nodes) * servers_per_tor < num_servers
       best_neigh = 0;
       best_similar = 0;
       cur_neighs =find(mat(cur_node,:)); 
       for neigh = cur_neighs
           if  any(nodes==neigh) ~= 0
               continue;
           end
           cur_res = length(intersect(nodes,find(mat(neigh,:))));
           if cur_res > best_similar
               best_similar = cur_res;
               best_neigh = neigh;
           end
       end
      nodes = [nodes ; best_neigh];
      cur_node = best_neigh;
   end
   disp(num_servers);
   disp(nodes);
   disp(';;;;;;;;;;;;;;');
    vals = ones([1 length(nodes)]) * servers_per_tor;
    vals(length(nodes)) = num_servers - (length(nodes) -1 ) * servers_per_tor;
end
       
%        for neigh = find(mat(cur_node,:))
%            if ~visited(cur_node)
%               nodes = [nodes ; cur_node ];
%               visited(cur_node) = 1;
%            end
%            
%            if length(nodes) * servers_per_tor >= num_servers
%                break;
%            end
%            
%            
%            
%            
%     end
%     nodes = 1:int32( ceil(num_servers/servers_per_tor) );
%     vals = ones([1 length(nodes)]) * servers_per_tor;
%     vals(length(nodes)) = num_servers - (length(nodes) -1 ) * servers_per_tor;
% end


function [nodes, vals] = get_nodes_fattree(num_servers, servers_per_tor)
    nodes = 1:int32( ceil(num_servers/servers_per_tor) );
    vals = ones([1 length(nodes)]) * servers_per_tor;
    vals(length(nodes)) = num_servers - (length(nodes) -1 ) * servers_per_tor;
end

function avg_len = get_avg_path(shortest_mat, nodes, servers)
   avg_len = 0;
   
   for src_i=1:length(nodes)
      for dst_i = src_i+1:length(nodes)
          avg_len = avg_len + shortest_mat(src_i,dst_i) * servers(src_i) * servers(dst_i);
      end
   end
   num_servers = sum(servers);
   avg_len = avg_len / (num_servers * (num_servers-1) /2 );
end