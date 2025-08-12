def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def transitive_closure(g): 
    closure = set(g)
    change_closure = set() 
    while True:
        new_relations = set((x,w) for x, y in closure for q, w in closure if q == y and (x,w) not in closure) 
        change_closure = closure | new_relations 
        if change_closure == closure: 
            break
        else: 
            closure = change_closure 
    return closure 



