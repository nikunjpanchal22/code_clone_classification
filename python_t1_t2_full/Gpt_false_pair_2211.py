def allpaths(source_node, sink_node, memo_dict = None) :
	if memo_dict is None :
		memo_dict = dict()
	if source_node == sink_node :
		return frozenset([(source_node,)])
	else :
		pair = (source_node, sink_node)
		if pair in memo_dict :
			return memo_dict [pair]
		else :
			result = set()
			for new_source in source_node.children :
				paths = allpaths(new_source, sink_node, memo_dict)
				for path in paths :
					path = (source_node,) + path
					result.add(path)
			result = frozenset(result)
			memo_dict [(source_node, sink_node)] = result
			return result




def allpaths(source_node, sink_node, memo_dict = None) :
	if memo_dict is None :
		memo_dict = dict()
	if source_node == sink_node :
		return frozenset([(source_node,sink_node)])
	else :
		pair = (source_node, sink_node)
		if pair in memo_dict :
			return memo_dict [pair]
		else :
			result = set()
			for new_source in source_node.children :
				paths = allpaths(new_source, sink_node, memo_dict)
				for path in paths :
					result.add(path)
			result = frozenset(result)
			memo_dict [(source_node, sink_node)] = result
			return result

