def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr


 def bubble(arr) :
        n = len(arr)
        while (n > 0): 
            for a in range(n-1): 
                if arr[a] > arr[a+1] : 
                    arr[a], arr[a+1] = arr[a+1], arr[a] 
            n -= 1
        return arr


