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


		node = stack.pop()
		if node not in visited:
			visited.append(node)
			stack.extend(reversed(graph[node]))
	return visited




def dfs(graph, start):
	visited = []
	stack = [start]


