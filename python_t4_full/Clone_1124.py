def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr



 def bubble(arr) : 
	n = len(arr)
	for a in range(n) :
		for b in range(0, n - a - 1) :
			if arr[b] > arr[b + 1] :
				arr[b], arr[b + 1] = arr[b + 1], arr[b]


