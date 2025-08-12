def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(unsortedList, compare=operator.lt):
	if len(unsortedList) < 2:
		return unsortedList[:]
	else:
		middleIndex = int(len(unsortedList)/2)
		leftList = mergeSort(unsortedList[:middleIndex], compare)
		rightList = mergeSort(unsortedList[middleIndex:], compare)
		return merge(leftList, rightList, compare)
