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
    last = None 
    for i in reversed(range(maxlen-1)):
        for node in graph[path[-1]]:
            if cache[node] == i:
                last = node
                break
        if last is None: 
            assert(0)
        path.append(last)
    return path


