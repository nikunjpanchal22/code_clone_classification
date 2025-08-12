def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr




def bubbleSort (arr) :
	sizeOn = len(arr)
	for a in range(sizeOn) :
		for b in range(sizeOn - 1) : 
			if (arr[a] < arr[b]) :
				arr[a], arr [b] = arr [b], arr [a]
	return arr 

