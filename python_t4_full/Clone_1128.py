def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr



 def bubble(arr) : 
	for i in range(len(arr) - 1, 0, -1):
		for j in range(i):
			if (arr[j] > arr[j+1]):
				arr[j], arr[j+1] = arr[j+1], arr[j]


