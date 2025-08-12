def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def transitive_closure(inlist): 
	closure = set(inlist) 
	while True: 
		new_relations = set((x, y) for x, z in closure for q, y in closure if z == q and (x,y) not in closure) 
		res_till_now = closure | new_relations 
		if closure == res_till_now: 
			break
		closure = res_till_now 
	return closure 
