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
        midPoint = int(len(list)/2)
        leftHalf = mergeSort(list[:midPoint], compare)
        rightHalf = mergeSort(list[midPoint:], compare)
        return merge(leftHalf, rightHalf, compare)
