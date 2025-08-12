def transitive_closure(a) :
	closure = set(a)
	while True :
		new_relations = set((x, w) for x, y in closure for q, w in closure if q == y)
		closure_until_now = closure | new_relations
		if closure_until_now == closure :
			break
		closure = closure_until_now
	return closure


 def transitive_closure(a):
  closure = set(a)
  while True: 
    initial_length = len(closure)
    new_relations = set((x,w) for x,y in closure for q,w in closure if q == y) 
    closure_until_now = closure | new_relations
    current_length = len(closure)
    if current_length == initial_length:
      break
    closure = closure_until_now
  return closure
