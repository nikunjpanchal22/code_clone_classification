def find_longest_path(graph, start) :
	cache = {}
	maxlen = find_longest_path_rec(graph, start, cache)
	path = [start]
	for i in range(maxlen - 1, 0, - 1) :
		for node in graph [path [- 1]] :
			if cache [node] == i :
				path.append(node)
				break
		else :
			assert (0)
	return path


  def find_longest_path(graph, start): 
    cache = {} 
    maxlen = find_longest_path_rec(graph, start, cache) 
    path = [start] 
    for i in range(maxlen - 1, 0, -1): 
        for node in [node for node in graph[path[-1]] if cache[node] == i]: 
            path.append(node) 
            break 
        else: 
            assert(0) 
    return path
