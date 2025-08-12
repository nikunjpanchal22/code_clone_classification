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
        new_relation = set((i,j) for i, j in closure for s, m in closure if m == j and (s,m) not in closure) 
        updated_closure = closure | new_relation 
        if closure == updated_closure: 
            break 
        closure = updated_closure
    return closure 
