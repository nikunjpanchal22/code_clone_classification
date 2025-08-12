def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(list_items, compare=operator.lt):
    if len(list_items) < 2:
        return list_items[:]
    else:
        middle_item = int(len(list_items) / 2)
        left_side = mergeSort(list_items[:middle_item], compare)
        right_side = mergeSort(list_items[middle_item:], compare)
        return merge(left_side, right_side, compare)
