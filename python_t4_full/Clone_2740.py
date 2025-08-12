def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index >= 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens


 def evaluate(tokens, ops, precedence):
	prec_map = dict()
	for prec in reversed(precedence):
		prec_map[prec] = find_op(tokens, prec) 
	while any([v is not None and v >= 0 for v in prec_map.values()]):
		max_prec, max_index = max((v,k) for k,v in prec_map.items() if v is not None and v >= 0 )
		tokens = reduce_binary_infix(tokens, max_index, ops)
		for prec in reversed(precedence):
			prec_map[prec] = find_op(tokens, prec) 

	return tokens


