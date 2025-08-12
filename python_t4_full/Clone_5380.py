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
def qsort(arr, low, high):
    def partition(arr, low, high):
        i = (low - 1)
        pivot = arr[int(random.uniform(low, high))]
        for j in range(low, high):
            if arr[j] <= pivot:
                i += 1
                arr[i], arr[j] = arr[j], arr[i]
        arr[i + 1], arr[high] = arr[high], arr[i + 1]
        return (i + 1)
    
    if low < high :
        pi = partition(arr, low, high)
        qsort(arr, low, pi - 1)
        qsort(arr, pi + 1, high)



