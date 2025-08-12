def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr




def bubble(arr) :
	lengths = len(arr)
	for index in range(lengths) :
		for indices in range(lengths - 1) :
			if (arr [index] < arr [indices]) :
			arr [index], arr [indices] = arr [indices], arr [index]
	return arr
