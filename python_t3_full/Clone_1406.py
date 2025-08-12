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
	new_relations = set()
	while True:
		open_relations = set((x,y) for x,y in closure for q,w in closure if q == y and (x,w) not in closure) 
		if open_relations:
			new_relations = new_relations | open_relations
			closure = closure | open_relations
		else:
			break
	return closure


