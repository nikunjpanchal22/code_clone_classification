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
    idx = 0
    while idx < len(exp):
        item = exp[idx]
        if item in precedence:
            result = ops[item](exp[idx - 1], exp[idx + 1])
            exp = exp[:idx - 1] + [result] + exp[idx + 2:]
        idx += (1 if item not in precedence else 0)
    return exp[0]




