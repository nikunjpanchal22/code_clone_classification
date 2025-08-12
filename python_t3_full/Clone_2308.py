def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure





def transitive_closure_2(a) :
	clo_set = set(a)
	while True :
		new_set = set((x, w) for x, y in clo_set for q, w in clo_set if q == y)
		if new_set.issubset(clo_set) :
			break


