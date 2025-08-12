def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr




def bubble(arr):
    l = len(arr)
    for i in range(l-1) :
        for j in range(0, l-i-1) :
            if arr[j] > arr[j+1] :
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr


