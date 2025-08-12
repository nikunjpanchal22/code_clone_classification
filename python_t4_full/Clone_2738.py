def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index >= 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens


 def evaluate(tokens, ops, precedence):
	for prec in precedence:
		start_index = 0
		while start_index < len(tokens):
			index = find_op(tokens[start_index:], prec)
			if index >= 0:
				tokens = reduce_binary_infix(tokens, index+start_index, ops)
				start_index = 0
			else:
				start_index += 1
	return tokens


