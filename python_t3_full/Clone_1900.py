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
    for index in range(len(A)-1, -1, -1):
        value = A[index]
        found = False
        for k in range(len(known)-1, -1, -1):
            if known[k][1] > value:
                found = True
                result.append(known[k][0])
                break
            else:
                known.pop(k)
        if not found:
            result.append(-1)
        known.append((index,value))
    return np.array(result)[::-1]


