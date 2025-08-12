def time_overlap_projected_graph_parallel(B, nodes) :
	G = nx.MultiGraph()
	G.add_nodes_from((n, B.node [n]) for n in nodes)
	cells = [n for n in B.nodes() if n [0] not in nodes]
	for cell in cells :
		for u, v in combinations(B [cell], 2) :
			for uspell in B.get_edge_data(u, cell).values() :
				ustart = uspell [1]
				uend = uspell [2]
				for vspell in B.get_edge_data(v, cell).values() :
					vstart = vspell [1]
					vend = vspell [2]
					if uend > vstart and vend > ustart :
						ostart = max(ustart, vstart)
						oend = min(uend, vend)
						olen = (oend - ostart + 1) / 86400
						ocell = cell
						if (v not in G [u] or ostart not in [edict [1] for edict in G [u] [v].values()]) :
							G.add_edge(u, v, {0 : olen, 1 : ostart, 2 : oend, 3 : ocell})
	return G


 def time_overlap_projected_graph_parallel(B, nodes) :
   G = nx.MultiGraph()
   G.add_nodes_from((n, B.node[n]) for n in nodes)
   non_nodes = [n for n in B.nodes() if n[0] not in nodes]
   for cell in non_nodes:
       u_v_pairs = itertools.combinations(B[cell], 2)
       uspell_list = [B.get_edge_data(u, cell).values() for u, v in u_v_pairs]
       vspell_list = [B.get_edge_data(v, cell).values() for u, v in u_v_pairs]
       for u, v, uspell, vspell in zip(u_v_pairs, uspell_list, vspell_list):
           ustart = uspell[1]
           uend = uspell[2]
           vstart = vspell[1]
           vend = vspell[2]
           if uend > vstart and vend > ustart:
               ostart = max(ustart, vstart)
               oend = min(uend, vend)
               olen = (oend - ostart + 1) / 86400
               ocell = cell
               if (v not in G[u] or ostart not in [dict[1] for dict in G[u][v].values()]):
                   G.add_edge(u, v, {0: olen, 1: ostart, 2: oend, 3: ocell})
   return G
