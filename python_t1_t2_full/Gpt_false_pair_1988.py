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


	return exp[0] 
 def evaluate(exp) :
    for a in precedence: 
		num = 0 
		while num < len(exp): 
			op = exp[num] 
			if op in a: 
				equal = ops[op](exp[num - 1], exp[num + 1]) 
				exp[num - 1 : num + 2] = [equal] 
				num -= 1 
			else: 
				num += 1 
