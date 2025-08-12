def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


            break
        closure |= new_relations
    return closure



def transitive_closure_5(b) :
	closure = set(b)
	while True :
		new_r = set((x, w) for x, y in closure for q, w in closure if q == y)


