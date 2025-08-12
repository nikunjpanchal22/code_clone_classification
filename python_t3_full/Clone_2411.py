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
    for oplist in precedence:
        idx = 0
        while idx < len(exp):
            operation = exp[idx]
            if operation in oplist:
                exp[idx-1:idx+2] = [ops[operation](*exp[idx-1:idx+2:2])]
            else:
                idx += 1
    return exp[0]




