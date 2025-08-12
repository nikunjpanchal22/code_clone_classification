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
	ptr = 0
	count = 0

	while ptr < len(exp) :
		op = exp[ptr]
		if op in precedence[count] :
			result = ops[op](exp[ptr-1], exp[ptr+1])
			exp[ptr-1:ptr+2] = [result]
			ptr -= 2 if ptr > 0 else 0
			count = 0
		else :
			count += 1
			ptr += 1
	return exp[0]


