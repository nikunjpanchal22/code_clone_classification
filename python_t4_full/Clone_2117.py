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
	 while True:
	 	closure_list =list(closure)
	 	new_relation= set()
	 	for xy in closure_list:
	 		x,y = xy
	 		for qw in closure_list:
	 			q,w = qw
	 			if q == y and (x,w) not in closure:
	 				new_relation.add((x,w))
	 	if new_relation:
	 		closure = closure | new_relation
	 	else:
	 		break		
	 return closure


