def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr




def bubble(arr) :
	size = len(arr)
	for a in range(size) :
		for b in range(size - 1) :
			if (arr [a] > arr [b]) :
				arr [a], arr [b] = arr [b], arr [a]
	return arr
