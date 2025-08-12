def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure




def transitive_closure4(a):
	closure4 = set(a)
	while True :
		new_relations4 = set((x, w) for x, y in closure4 for q, w in closure4 if q == y)	
		closure_until_now4 = closure4 | new_relations4	
		if closure_until_now4 == closure4 :
			break
		closure4 = closure_until_now4
	return closure4
