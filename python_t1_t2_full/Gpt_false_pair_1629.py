def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def trans_closure(graph): 
    closure = set(graph) 
    while True: 
        relation_needed = set((s,d) for s, p in closure for m, d in closure if p == m and (s,d) not in closure) 
        closure_updated = closure | relation_needed 
        if closure_updated == closure: 
            break 
        else: 
            closure = closure_updated 
    return closure
