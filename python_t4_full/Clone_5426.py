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


 
 
import numpy as np
def future6(A):
	result, known = np.empty(len(A), dtype=int), []
	for idx in range(len(A) - 1, - 1, - 1):
		value = A[idx]
		known = [(x, y) for x, y in known if y > value]
		result[idx] = -1 if not known else known[-1][0]
		known.append((idx, value))


