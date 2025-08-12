def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(list_of_numbers, compare=operator.lt):
    if len(list_of_numbers) < 2:
        return list_of_numbers[:]
    else:
        middle = int(len(list_of_numbers) / 2)
        left_list = mergeSort(list_of_numbers[:middle], compare)
        right_list = mergeSort(list_of_numbers[middle:], compare)
        return merge(left_list, right_list, compare)
