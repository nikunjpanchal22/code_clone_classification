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




def evaluate(exp) :
	for oplist in precedence :
		index = 0
		while index < len(exp) :
			operator = exp [index]
			if operator in oplist :
				result = ops [operator](exp [index - 1], exp [index + 1])
				exp [index - 1 : index + 2] = [result]
				index -= 1
			else :
				index += 1
	return exp [0]

