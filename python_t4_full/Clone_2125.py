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
    new_relations = set()
    while True:
        updated = False
        for x,y in closure:
            for q,w in closure:
                if q == y:
                    new_relations.add((x,w))
                    updated = True
        closure = closure | new_relations
        if not updated:
            break


