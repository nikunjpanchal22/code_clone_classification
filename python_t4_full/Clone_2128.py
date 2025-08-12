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
    any_new_relations = True
    while any_new_relations:
        any_new_relations = False
        for x, y in closure:
            for q, w in closure:
                if q == y and (x, w) not in closure:
                    closure.add((x, w))
                    any_new_relations = True


