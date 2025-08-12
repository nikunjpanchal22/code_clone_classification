def numpy_ewma(data, window) :
	returnArray = np.empty((data.shape [0]))
	returnArray.fill(np.nan)
	e = data [0]
	alpha = 2 / float(window + 1)
	for s in range(data.shape [0]) :
		e = ((data [s] - e) * alpha) + e
		returnArray [s] = e
	return returnArray


 def numpy_ewma(data, window) :
    returnArray = np.empty((data.shape [0]))
    returnArray.fill(np.nan)
    alpha = 2 / float(window + 1)
    for s in range(data.shape [0]) :
        returnArray[s] = (1 - alpha)*returnArray[s-1] + alpha*data[s]
    return returnArray


