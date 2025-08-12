def evaluate(exp) :
	for oplist in precedence :
		idx = 0
		while idx < len(exp) :
			op = exp [idx]
			if op in oplist :
				result = ops [op](exp [idx - 1], exp [idx + 1])
				exp [idx - 1 : idx + 2] = [result]
				idx -= 1
			else :
				idx += 1
	return exp [0]




def evaluate(expression) :
	for precedence_list in precedence :
		index_value = 0
		while index_value < len(expression) :
			operation = expression [index_value]
			if operation in precedence_list :
				result = ops [operation](expression [index_value - 1], expression [index_value + 1])
				expression [index_value - 1 : index_value + 2] = [result]
				index_value -= 1
			else :
				index_value += 1
	return expression [0]
