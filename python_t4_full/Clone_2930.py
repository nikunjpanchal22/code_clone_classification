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


 def qsort(arr, first, last): 
    if first >= last: 
        return 
  
    lft, rgt = first, last 
    pivot = arr[random.randint(first, last)] 
    while lft <= rgt: 
        while arr[lft] < pivot: 
            lft += 1
        while arr[rgt] > pivot: 
            rgt -= 1 
        if lft <= rgt: 
            arr[lft], arr[rgt] = arr[rgt], arr[lft] 
            lft += 1 
            rgt -= 1 
    qsort(arr, first, rgt) 
    qsort(arr, lft, last)



