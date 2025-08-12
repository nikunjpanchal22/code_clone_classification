def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr



 def bubble(arr) : 
	length = len(arr)
	for a in range(length) :
		for b in range(length - a - 1) :
			if arr [a] < arr [b] :
			arr [a], arr [b] = arr [b], arr [a]


