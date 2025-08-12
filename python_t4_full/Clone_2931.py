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


 def qsort(lst, first, last): 
    if first >= last: 
        return 
  
    left, right = first, last 
    pivot = lst[random.randint(first, last)] 
    while left <= right: 
        while lst[left] < pivot: 
            left += 1
        while lst[right] > pivot: 
            right -= 1 
        if left <= right: 
            lst[left], lst[right] = lst[right], lst[left] 
            left += 1 
            right -= 1 

    qsort(lst, first, right) 
    qsort(lst, left, last) 


