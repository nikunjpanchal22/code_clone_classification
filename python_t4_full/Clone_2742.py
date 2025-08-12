def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index >= 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens


 def evaluate(tokens, ops, precedence):
	while precedence:
		index = find_op(tokens, precedence.pop())
		if index >= 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			precedence.append(0)
	return tokens


