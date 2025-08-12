def transitive_closure(a) :
	closure = set()
	for x, _ in a :
		closure |= set((x, y) for y in dfs(x, a))
	return closure




def transitive_closure(a):
	closure = set()
	for x, _ in a:
		closure |= set((x,y) for y in iterative_dfs(x, a))
	return closure

