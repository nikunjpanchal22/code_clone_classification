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
    size = len(closure) 
    while True: 
        new_relation = set((s,t) for s, q in closure for m, t in closure if q == m and (s,t) not in closure) 
        result_till_now = closure | new_relation 
        if size == len(closure): 
            break 
        else: 
            size = len(closure) 
    return result_till_now 


