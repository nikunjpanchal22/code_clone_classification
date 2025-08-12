def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure



 

def tc_2(a):
    tc = set(tuple(rel) for rel in a)
    size_before = 0
    while size_before < len(tc):
        size_before = len(tc)


