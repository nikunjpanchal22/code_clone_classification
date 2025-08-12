def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def transitive_closure(edges): 
    current_closure = set(edges) 
    size = len(current_closure) 
    while True:
        new_relations = set((x,w) for x, y in current_closure for q, w in current_closure if q == y and (x,w) not in current_closure) 

        current_closure.update(new_relations) 

        if size == len(current_closure): 
            break
        else: 
            size = len(current_closure)
    return current_closure 


