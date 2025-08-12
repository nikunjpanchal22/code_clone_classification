def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
				arr [a], arr [b] = arr [b], arr [a]
	return arr


  def bubble(arr) :
	n = len(arr)
	for i in range(n-1) :
		for j in range(n - i - 1):
			if (arr [j + 1] < arr [j]) :
				arr[j], arr[j + 1] = arr[j + 1], arr[j]
	return arr


