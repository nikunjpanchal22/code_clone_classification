def qsort(l, fst, lst) :
	if fst > = lst : return
	i, j = fst, lst
	pivot = l [random.randint(fst, lst)]
	while i < = j :
		while l [i] < pivot : i += 1
		while l [j] > pivot : j -= 1
		if i < = j :
			l [i], l [j] = l [j], l [i]
			i, j = i + 1, j - 1
	qsort(l, fst, j)
	qsort(l, i, lst)






import random
def qsort(l, fst, lst):
    if lst-fst <= 0: return
    i, j = fst, lst
    pivot = l[i + random.randint(0, j - i)]
    while i <= j:
        while l[i] < pivot: i += 1
        while l[j] > pivot: j -= 1
        if i <= j:
            l[i], l[j] = l[j], l[i]
            i, j = i + 1, j - 1


