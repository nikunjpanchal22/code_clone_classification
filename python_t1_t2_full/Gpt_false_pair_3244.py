def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr




def bubble(arr) :
	l = len(arr)
	for i in range(l) :
		for j in range(l - 1) :
			if arr [j] > arr [i] :
			arr [i], arr [j] = arr [j], arr [i]
	return arr

