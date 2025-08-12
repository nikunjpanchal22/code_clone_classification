def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr


  def bubble(arr) : 
        for a in range(len(arr)-1) :
            for b in range(a+1,len(arr)) : 
                if (arr[a] > arr[b]) :
                    arr[a], arr[b] = arr[b], arr[a]
        return arr


