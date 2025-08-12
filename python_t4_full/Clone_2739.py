def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index >= 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens


 def evaluate(tokens, ops, precedence):
	if len(precedence) == 0 : raise ValueError('No precedence given')
		
	for _ in range(len(precedence)):	
		for prec in precedence:
			index = find_op(tokens, prec)
			if index >= 0 :
				tokens = reduce_binary_infix(tokens, index, ops)
				break
		else : raise ValueError('Malformed expression')
	return tokens


