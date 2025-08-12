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
    for operation_lst in precedence:
        idx = 0
        while idx < len(exp):
            if exp[idx] in operation_lst:
                result = ops[exp[idx]](*exp[idx-1:idx+2:2])
                exp = exp[:idx-1] + [result] + exp[idx+2:]
            idx += 1 if exp[idx] not in operation_lst else 0
    return exp[0]




