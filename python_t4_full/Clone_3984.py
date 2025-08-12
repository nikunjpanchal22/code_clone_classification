def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr




def bubble(arr):
    for _ in range(len(arr)):
        for idx in range(1, len(arr)):
            if arr[idx-1] > arr[idx]:
                arr[idx-1], arr[idx] = arr[idx], arr[idx-1]
    return arr


