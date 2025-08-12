def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr



 def bubble(array) : 
	for x in range(len(array)) :
		for y in range(0, len(array)-x-1) :
			if array[y] > array[y+1] :
				array[y],array[y+1] = array[y+1],array[y]


