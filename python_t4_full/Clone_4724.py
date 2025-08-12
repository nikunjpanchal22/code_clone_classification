def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


    return closure




def transitive_closure(a):
    closure = a[:]
    while True:
        closure_prev = closure[:]
        closure.extend([(x, z) for x, y in closure for y2, z in closure if y == y2 and (x, z) not in closure])


