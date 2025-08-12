def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergesort(L, comparison=operator.lt):
    if len(L) < 2:
        return L[:]
    else:
        mid_i = len(L) // 2
        left = mergesort(L[:mid_i], comparison)
        right = mergesort(L[mid_i:], comparison)
        return merge(left, right, comparison)
