def numpy_ewma(data, window) :
	returnArray = np.empty((data.shape [0]))
	returnArray.fill(np.nan)
	e = data [0]
	alpha = 2 / float(window + 1)
	for s in range(data.shape [0]) :
		e = ((data [s] - e) * alpha) + e
		returnArray [s] = e
	return returnArray




def numpy_ewma_3(data, window) :
	returnArray = np.empty((data.shape [0]))
	returnArray.fill(np.nan)
	e = data[0]
	coef = 2 / float(window+1)
	for idx in range(data.shape [0]) :
		e = (data[idx]-e)*coef + e
		returnArray[idx] = e
	return returnArray
