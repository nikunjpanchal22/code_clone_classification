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
    while True:
        new_relations = set()
        for x,y in closure:
            for q,w in closure:
                if q == y:
                    new_relations.add((x,w))
        original_closure_len = len(closure)
        closure |= new_relations
        if original_closure_len == len(closure):
            break


