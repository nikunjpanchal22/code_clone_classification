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
    for prio in precedence :
        idx = 0
        while idx < len(exp) :
            if exp[idx] in prio:
                result = ops[exp[idx]](exp[idx-1], exp[idx+1])
                exp[idx-1:idx+2] = [result]
            idx += 1 if exp[idx] not in prio else 0
    return exp[0]




