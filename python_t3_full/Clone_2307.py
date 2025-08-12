def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


def transitive_closure_9(a) :
	closure = set(a)
	while True :
		relations_new = set((x, y) for x, m in closure for n, y in closure if m == n)
		if relations_new.issubset(closure):
			break
		closure |= relations_new
	return closure


