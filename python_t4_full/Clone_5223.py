def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index > = 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens




 

def evaluate(tokens, ops, precedence):
	for prec in precedence:
		while True:
			index = find_op(tokens, prec)
			if index < 0:
				break


