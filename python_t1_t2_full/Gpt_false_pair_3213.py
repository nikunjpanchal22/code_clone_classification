def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index > = 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens




def process_tokens(symbols, operators, order):
	for p in order: 
		loc = find_op(symbols, p)
		while loc >= 0: 
			symbols = reduce_infix_binary(symbols, loc, operators)
			loc = find_op(symbols, p)
	return symbols
