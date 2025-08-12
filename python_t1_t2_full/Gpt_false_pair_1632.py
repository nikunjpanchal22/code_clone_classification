def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def transitive_closure(graph): 
    closure = set(graph) 
    while True:
        new_relation = set((x,y) for x, y in closure for q, w in closure if y == q and (q,w) not in closure) 
        closure_till_now = closure | new_relation 
        if closure_till_now == closure: 
            break 
        closure = closure_till_now
    return closure 
