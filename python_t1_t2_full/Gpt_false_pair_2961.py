def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)




def mergeSort(L, compare = operator.lt) :
	if (len(L) < 2) :
		return L[:]
	else :
		mid = int(len(L) / 2)
		leftPtr = mergeSort(L[:mid], compare)
		rightPtr = mergeSort(L[mid:], compare)
		return merge(leftPtr, rightPtr, compare)

