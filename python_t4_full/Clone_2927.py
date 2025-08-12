def qsort(l, fst, lst) :
	if fst >= lst : return
	i, j = fst, lst
	pivot = l [random.randint(fst, lst)]
	while i <= j :
		while l [i] < pivot : i += 1
		while l [j] > pivot : j -= 1
		if i <= j :
			l [i], l [j] = l [j], l [i]
			i, j = i + 1, j - 1
	qsort(l, fst, j)
	qsort(l, i, lst)


 def qsort(arr, start, end): 
    if start >= end: 
        return 
  
    left, right = start, end 
    pivot = arr[random.randint(start, end)] 
    while left <= right: 
        while arr[left] < pivot: 
            left += 1
        while arr[right] > pivot: 
            right -= 1 
        if left <= right: 
            arr[left], arr[right] = arr[right], arr[left] 
            left += 1 
            right -= 1 

    qsort(arr, start, right) 
    qsort(arr, left, end)


