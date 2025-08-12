def numpy_ewma(data, window) :
	returnArray = np.empty((data.shape [0]))
	returnArray.fill(np.nan)
	e = data [0]
	alpha = 2 / float(window + 1)
	for s in range(data.shape [0]) :
		e = ((data [s] - e) * alpha) + e
		returnArray [s] = e
	return returnArray


    alpha = 2 / float(window + 1)
    return np.array([((data[s] - ((data[s-1] if s > 0 else data[s]) * alpha)) + (data[s-1] if s > 0 else data[s])) for s in range(data.shape[0])])



import numpy as np

def numpy_ewma_v6(data, window) :
    alpha = 2 / (window + 1)
    e = data[0]
    returnAlpha = [e]


