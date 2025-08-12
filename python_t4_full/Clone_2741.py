def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index >= 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens


 def evaluate(tokens, ops, precedence):
	for _ in range(len(precedence)):
		index = 0
		while index < len(tokens):
			dex = find_op(tokens[index:], precedence[index % len(precedence)])
			if dex >= 0 :
				tokens = reduce_binary_infix(tokens, dex+index, ops)
			index += 1
	return tokens


