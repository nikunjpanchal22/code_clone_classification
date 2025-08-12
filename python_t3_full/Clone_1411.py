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
	    evaluated_sets = []
	    while True:
	        new_relations = set((x ,w) for x ,y in closure for q, w in closure if q == y)
	        evaluated_sets.append((closure, new_relations))
	        if len(new_relations) == 0:
	            break
	        closure = closure | new_relations


