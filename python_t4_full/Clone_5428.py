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


	return np.array(result)

 
 
import numpy as np
def future6(A):
	known, result = [], []
	for idx in range(len(A) - 1, -1, -1):
		known = [k for k in known if k[1] > A[idx]]


