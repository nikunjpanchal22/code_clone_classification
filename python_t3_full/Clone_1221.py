def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(arr, comparison_func=operator.lt):
	if len(arr) < 2:
		return arr
	else:
		mid = len(arr) // 2
		left = mergeSort(arr[:mid], comparison_func)
		right = mergeSort(arr[mid:], comparison_func)
		return merge(left, right, comparison_func)


