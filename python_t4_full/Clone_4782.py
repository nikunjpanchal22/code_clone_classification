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

def numpy_ewma_v2(data, window) :
    e, alpha = data[0], 2 / (window + 1)
    return list(e + alpha * (data[s] - e) for s in range(data.shape[0]))


