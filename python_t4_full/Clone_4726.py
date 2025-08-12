def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


		closure_value = new_val
	return closure_value



def transitive_closure_4(a):
    closure = set(a)
    while True:
        new_relations = set((i, j) for i, x in closure for y, j in closure if x == y)


