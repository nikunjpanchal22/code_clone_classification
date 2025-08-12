def numpy_ewma(data, window) :
	returnArray = np.empty((data.shape [0]))
	returnArray.fill(np.nan)
	e = data [0]
	alpha = 2 / float(window + 1)
	for s in range(data.shape [0]) :
		e = ((data [s] - e) * alpha) + e
		returnArray [s] = e
	return returnArray




def numpy_ewma_4(data, window) :
	returnArray = np.empty((data.shape [0]))
	returnArray.fill(np.nan)
	e = data[0]
	coefficient = 2 / float(window+1)
	for loop in range(data.shape [0]) :
		e = (data[loop]-e)* coefficient+e
		returnArray[loop] = e
	return returnArray
