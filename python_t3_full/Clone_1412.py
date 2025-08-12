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
	        current_relations_size = len(closure)
	        new_relations = set((x, w) for x,y in closure for q, w in closure if q == y)
	        closure = closure.union(new_relations)
	        if (current_relations_size == len(closure)):
	            break


