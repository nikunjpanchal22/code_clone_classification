def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr




def bubble_4(arr):
	l = len(arr)
	for a in range(l):
		for b in range(l - 1):
			if (arr[a] < arr[b]):
				arr[b], arr[a] = arr[a], arr[b]
	return arr
