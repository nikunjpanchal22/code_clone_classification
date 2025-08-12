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




def evaluate(exp): 
	for oplist in precedence: 
		i = 0
		while i < len (exp): 
			op = exp[i]
			if op in oplist: 
				result = ops[op](exp[i - 1], exp[i + 1])
				exp[i - 1 : i + 2] = [result]
				i -= 1
			else: 
				i += 1
	return exp[0]
