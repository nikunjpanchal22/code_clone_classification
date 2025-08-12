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
        current_value = A[index]
        for item in known[:]:
            if item[1] > current_value:
                known.remove(item)
        if len(known) > 0: 
            result.append(known[-1][0])
        else:
            result.append(-1)
        tup = (index,current_value)
        known.append(tup)
    return np.array(result)[::-1]
    


