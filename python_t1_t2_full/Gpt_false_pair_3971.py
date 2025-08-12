def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure




def transitive_closure_type3(a) :
	closure = set(a)
	while True :
		related_pairs = set((x, w) for x, y in closure for q, w in closure if q == y)
		combined_relation = closure | related_pairs
		if combined_relation == closure :
			break
		closure = combined_relation
	return closure
