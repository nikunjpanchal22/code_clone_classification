def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


def mergesort(arr, cmp=operator.lt): 
	if len(arr) < 2: 
		return arr[:] 
	else: 
		middle = len(arr)//2 
		left_side = mergesort(arr[:middle], cmp) 
		right_side = mergesort(arr[middle:], cmp) 
		return merge(left_side, right_side, cmp)
