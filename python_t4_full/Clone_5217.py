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
            try:
                if exp[idx] in oplist:
                    result = ops[exp [idx]](exp [idx-1], exp [idx+1])
                    del exp[idx-1:idx+2]
                    exp.insert(idx-1, result)
                else:
                    idx += 1
            except:
                idx += 1
    return exp[0]




