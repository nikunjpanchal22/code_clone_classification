def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(items, compare=operator.lt):
    if len(items) < 2:
        return items[:]
    else:
        middle = int(len(items) / 2)
        left_half = mergeSort(items[:middle], compare)
        right_half = mergeSort(items[middle:], compare)
        return merge(left_half, right_half, compare)
