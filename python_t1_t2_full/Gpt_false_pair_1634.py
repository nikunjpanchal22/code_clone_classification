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
        expecting_relation = set((x,y) for x, w in closure for q ,y in closure if w == q and (x,y) not in closure) 
        current_closure = closure | expecting_relation 
        if current_closure == closure: 
            break
        closure = current_closure 
    return closure 
