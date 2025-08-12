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



def quicksort_last(arr, low, high):
    if len(arr) == 1: return arr
    if low < high:
        pi = partition_last(arr, low, high)
        quicksort_last(arr, low, pi-1)
        quicksort_last(arr, pi+1, high)




