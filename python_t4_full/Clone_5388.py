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



def partition_first(arr, low, high):
    i = (high+1)  
    pivot = arr[low]
    for j in range(high, low, -1):
        if arr[j] > pivot:
            i = i-1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i-1], arr[low] = arr[low], arr[i-1]


