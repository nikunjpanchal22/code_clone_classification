def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def merge_sort(array, compare=operator.lt):

  if len(array) < 2:
    return array

  else:
    middle = len(array) // 2
    left = merge_sort(array[:middle], compare)
    right = merge_sort(array[middle:], compare)
    return merge(left,right, compare)



