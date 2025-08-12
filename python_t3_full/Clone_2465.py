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





def dfs(graph, node):
    print(node+"_start")
    if node not in graph:
        print(node+"_end")
        return
    for i, nd in enumerate(graph[node]):
        if i > 0:
            print(node+"_middle")
        dfs(graph, nd)


