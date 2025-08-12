def future6(A) :
	known = []
	result = []
	for idx in xrange(len(A) - 1, - 1, - 1) :
		value = A [idx]
		known = [(x, y) for x, y in known if y > value]
		if known :
			result.append(known [- 1] [0])
		else :
			result.append(- 1)
		known.append((idx, value))
	return np.array(result) [: : - 1]


 def future6(A):
    known = []
    result = []
    n = len(A)
    for i in range(n-1,-1,-1):
        value = A[i]
        new_known = []
        for j in known:
            if j[1] > value:
                new_known.append(j)
        if len(new_known) > 0:
            result.append(new_known[-1][0])
        else:
            result.append(-1)
        known = new_known
        known.append((i, value))
    return np.array(result)[::-1]


