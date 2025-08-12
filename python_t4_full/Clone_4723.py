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
    changed = True 
    while changed:
        changed = False  
        for x, y in list(closure): 
            for y2, z in list(closure): 
                if y==y2 and (x, z) not in closure: 
                    closure.add((x,z)) 


