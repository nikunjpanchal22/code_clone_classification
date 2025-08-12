def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr


 def bubble(arr) :
        for a in range(len(arr)) :
            for b in range(len(arr) - a - 1) : # reduce selection
                if arr[b] > arr[b+1] :
                    arr[b], arr[b+1] = arr[b+1], arr[b]
        return arr


