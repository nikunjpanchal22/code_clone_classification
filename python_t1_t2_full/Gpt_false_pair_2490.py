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
        val = A[i]
        temp_list = [(x,y) for x,y in known if y > val]
        if len(temp_list) > 0:
            result.append(temp_list[-1][0])
        else:
            result.append(-1)
        known.append((i,val))
    return np.array(result)[::-1]
