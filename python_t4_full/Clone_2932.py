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


 def qsort(ary, fi, la): 
    if fi >= la: 
        return 
  
    lf, rg = fi, la 
    pivot = ary[random.randint(fi, la)] 
    while lf <= rg: 
        while ary[lf] < pivot: 
            lf += 1
        while ary[rg] > pivot: 
            rg -= 1 
        if lf <= rg: 
            ary[lf], ary[rg] = ary[rg], ary[lf] 
            lf += 1 
            rg -= 1 

    qsort(ary, fi, rg) 
    qsort(ary, lf, la)


