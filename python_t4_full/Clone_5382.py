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
    if fst >= lst: return
    pivot = random.choice(l[fst:lst+1])
    left = [x for x in l[fst:lst+1] if x < pivot]
    middle = [x for x in l[fst:lst+1] if x == pivot]
    right = [x for x in l[fst:lst+1] if x > pivot]
    l[fst:lst+1] = left + middle + right
    qsort(l, fst, fst+len(left)-1)
    qsort(l, fst+len(left)+len(middle), lst)



