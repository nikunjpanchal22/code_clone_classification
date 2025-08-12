def dfs(graph, node) :
	print '{0}_start'.format(node)
	if node not in graph :
		print '{0}_end'.format(node)
		return
	for i, nd in enumerate(graph [node]) :
		if i > 0 :
			print '{0}_middle'.format(node)
		dfs(graph, nd)
	print '{0}_end'.format(node)


    print(node, '_end', sep='')




def dfs(graph, node):
    print('{}_start'.format(node))
    try:
        for i, nd in enumerate(graph[node]):
            if i > 0:
                print('{}_middle'.format(node))
            dfs(graph, nd)


