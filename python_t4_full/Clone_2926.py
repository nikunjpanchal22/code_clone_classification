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


 def qsort(ls, f, l): 
    if f >= l: 
        return 
  
    lef, rig = f, l 
    pivot = ls[random.randint(f, l)] 
    while lef <= rig: 
        while ls[lef] < pivot: 
            lef += 1
        while ls[rig] > pivot: 
            rig -= 1 
        if lef <= rig: 
            ls[lef], ls[rig] = ls[rig], ls[lef] 
            lef += 1 
            rig -= 1 
    qsort(ls, f, rig) 
    qsort(ls, lef, l)


