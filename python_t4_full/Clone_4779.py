def numpy_ewma(data, window) :
	returnArray = np.empty((data.shape [0]))
	returnArray.fill(np.nan)
	e = data [0]
	alpha = 2 / float(window + 1)
	for s in range(data.shape [0]) :
		e = ((data [s] - e) * alpha) + e
		returnArray [s] = e
	return returnArray


import numpy as np

def numpy_ewma_v1(data, window) :
    e = np.take(data, 0)
    alpha = 2. /(window+1)
    return [((d-e)*alpha)+e for d in data]



