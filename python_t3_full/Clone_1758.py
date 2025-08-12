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
	idx, oplist = 0, 0
	while idx < len(exp) :
		op = exp[idx]
		if op in precedence[oplist]:
			result = ops[op](exp[idx-1], exp[idx+1])
			exp[idx-1:idx+2] = [result]
			idx = 0 if idx <= 1 else idx -2
		else :
			idx, oplist = idx + 1, oplist + 1
	return exp[0]



