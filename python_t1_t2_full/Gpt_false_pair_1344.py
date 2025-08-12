def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


  def mergeSort(list, compare=operator.lt):
        if len(list) < 2:
            return list[:]
        else:
            middle_i = len(list)//2
            left_half = mergeSort(list[:middle_i], compare)
            right_half = mergeSort(list[middle_i:], compare)

            return merge(left_half,right_half, compare)
