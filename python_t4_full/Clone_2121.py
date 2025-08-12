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
    size = len(closure)
    while True:
        temp = set((src, dest) for src, dest in closure for p, q in closure if q == dest and (p, q) not in closure) 
        closure.update(temp) 
        if len(closure) == size: 
            break
        else: 
            size = len(closure) 
    return closure 


