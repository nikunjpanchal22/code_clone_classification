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
    for relation in closure:
        x = relation[0]
        y = relation[1]
        for other_relation in closure:
            q = other_relation[0]
            w = other_relation[1]
            if q == y:
                closure.add((x,w))


