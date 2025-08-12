def dfs(graph, start) :
	visited = {}
	stack = [(start, "XXX_THIS_NODE_DOES_NOT_EXIST_XXX")]
	while stack :
		node, parent = stack.pop()
		if parent is None :
			if visited [node] < 3 :
				print "{}_end".format(node)
			visited [node] = 3
		elif node not in visited :
			if visited.get(parent) == 2 :
				print "{}_middle".format(parent)
			elif visited.get(parent) == 1 :
				visited [parent] = 2
			print "{}_start".format(node)
			visited [node] = 1
			stack.append((node, None))
			for child in reversed(graph.get(node, [])) :
				if child not in visited :
					stack.append((child, node))




def dfs(graph, start) :
	visited = {}
	stack = [(start, "XXX_THIS_NODE_DOES_NOT_EXIST_XXX")]
	while stack :
		node, parent = stack.pop()
		if parent is None :
			if visited [node] < 3 :
				print "{}_fin".format(node)
			visited [node] = 3
		elif node not in visited :
			if visited.get(parent) == 2 :
				print "{}_completed".format(parent)
			elif visited.get(parent) == 1 :
				visited [parent] = 2
			print "{}_started".format(node)
			visited [node] = 1
			stack.append((node, None))
			for child in reversed(graph.get(node, [])) :
				if child not in visited :
					stack.append((child, node))
