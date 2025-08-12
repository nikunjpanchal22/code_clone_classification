def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(TO_SORT, compare=operator.lt):
    if len(TO_SORT) < 2:
        return TO_SORT[:]
    else: 
        middle_index = int(len(TO_SORT)/2)
        left_half = mergeSort(TO_SORT[:middle_index], compare)
        right_half = mergeSort(TO_SORT[middle_index:], compare)
        return merge(left_half, right_half, compare)
