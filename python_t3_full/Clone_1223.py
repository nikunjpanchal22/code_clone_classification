def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(L, cmp=operator.lt):
	if len(L) < 2:
		return L;
	else :
		mid = (len(L)//2)
		left = mergeSort(L[:mid], cmp)
		right = mergeSort(L[mid:], cmp)
		return merge(left, right, cmp)


