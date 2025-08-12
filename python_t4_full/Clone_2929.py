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


 def qsort(list, beg_ind, end_ind): 
    if beg_ind >= end_ind: 
        return 
  
    left, right = beg_ind, end_ind 
    pivot = list[random.randint(beg_ind, end_ind)] 
    while left <= right: 
        while list[left] < pivot: 
            left += 1
        while list[right] > pivot: 
            right -= 1 
        if left <= right: 
            list[left], list[right] = list[right], list[left] 
            left += 1 
            right -= 1 

    qsort(list, beg_ind, right) 
    qsort(list, left, end_ind)


