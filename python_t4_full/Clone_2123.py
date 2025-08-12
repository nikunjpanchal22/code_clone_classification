def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


#gpt output=============
  def transitive_closure(a) :
    closure = set()  
    new_relations = set()  
    while True:  
        for i in a:
            x = i[0]
            w = i[1]
            closure.add(i)
            for j in closure:
                q = j[1]
                if q == y:
                    new_relations.add((x,w))
        closure_until_now = closure | new_relations
        if closure_until_now == closure:
            break
        closure = closure_until_now


