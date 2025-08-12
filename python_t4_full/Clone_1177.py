def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr


 def bubble(arr) :
        sorted = True
        while sorted :
            sorted = False
            for a in range(len(arr)-1) :
                if arr[a] > arr[a+1] :
                    arr[a], arr[a+1] = arr[a+1], arr[a]
                    sorted = True
        return arr


