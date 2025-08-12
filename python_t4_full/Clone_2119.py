def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def transitive_closure(a):
	closure = set(a)
	all_new_relations = []
	while True:
		for x,y in closure:
			for q,w in closure:
				if q == y and (x,w) not in closure:
					all_new_relations.append((x,w))				
		if all_new_relations:
			closure = closure | set(all_new_relations)
		else:
			break	
	return closure


