def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)




def mergeSort(L, compare=operator.lt): 
    if len(L) < 2: 
        return L[:] 
    else: 
        mid = len(L) // 2
        left_list = mergeSort(L[:mid], compare)
        right_list = mergeSort(L[mid:], compare)
        return merge(left_list, right_list, compare)
