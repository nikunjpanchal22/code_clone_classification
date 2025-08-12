def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)




def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L[:]
	else :
		m = int(len(L) / 2)
		l_ptr = mergeSort(L[:m], compare)
		r_ptr = mergeSort(L[m:], compare)
		return merge(l_ptr, r_ptr, compare)
