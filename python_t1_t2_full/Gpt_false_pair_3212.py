def evaluate(tokens, ops, precedence) :
	for prec in precedence :
		index = find_op(tokens, prec)
		while index > = 0 :
			tokens = reduce_binary_infix(tokens, index, ops)
			index = find_op(tokens, prec)
	return tokens




def evaluate(token_list, operator_list, precedence_list) :
	for item in precedence_list :
		index = find_operation(token_list, item)
		while index >= 0 :
			token_list = reduce_binary_infix(token_list, index, operator_list)
			index = find_operation(token_list, item)
	return token_list
 
