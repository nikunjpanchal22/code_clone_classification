def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


    return merge(mergeSort(L[:mid], compare), mergeSort(L[mid:], compare), compare)


 


def mergeSort(L, compare = operator.lt):
    if len(L)>1 : 
        mid = len(L)//2
        left = mergeSort(L[:mid], compare)
        right = mergeSort(L[mid:], compare)


