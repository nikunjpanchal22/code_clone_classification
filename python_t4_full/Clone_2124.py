def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure



 def transitive_closure(a) :
    closure = set(a)
    closure_update_needed = False
    while True:
        new_relations = set()
        for x,y in closure:
            for q,w in closure:
                if q == y:
                    new_relations.add((x,w))
        if new_relations.issubset(closure):
            closure_update_needed = False
        else:
            closure_update_needed = True
            closure |= new_relations
        if not closure_update_needed:
            break


