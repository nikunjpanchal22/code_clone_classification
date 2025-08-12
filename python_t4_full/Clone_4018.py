def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr





def bubble(arr):
	l = len(arr)
	for _ in range(l):
		for a in range(1, l):
			if arr[a - 1] > arr[a]:
				arr[a - 1], arr[a] = arr[a], arr[a - 1]


