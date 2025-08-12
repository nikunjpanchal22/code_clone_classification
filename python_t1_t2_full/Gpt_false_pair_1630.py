def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def transitive_closure(data): 
    closure = set(data) 
    while True: 
        new_rels = set((a,b) for a, c in closure for q, b in closure if c == q and (a,b) not in closure) 
        trans_so_far = closure | new_rels 
        if trans_so_far == closure: 
            break
        else: 
            closure = trans_so_far 
    return closure 
