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
    while True :
        closure = closure.union((x, z) for x, y in closure for y2, z in closure if y == y2)
        if len(closure.difference(a)) == 0 :
            break
        a = closure


