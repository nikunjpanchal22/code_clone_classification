def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(sort_list, compare=operator.lt):
    if len(sort_list) < 2:
        return sort_list[:]
    else:
        mid_point = int(len(sort_list) / 2)
        left_list = mergeSort(sort_list[:mid_point], compare)
        right_list = mergeSort(sort_list[mid_point:], compare)
        return merge(left_list, right_list, compare)
