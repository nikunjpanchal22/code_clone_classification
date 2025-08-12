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




def evaluate(expression): 
	for operation_list in precedence: 
		index = 0
		while index < len(expression): 
			operation = expression[index]
			if operation in operation_list:
				result = ops[operation](expression[index - 1], expression[index + 1])
				expression[index - 1 : index + 2] = [result]
				index -= 1
			else: 
				index += 1
	return expression[0]

