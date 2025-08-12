def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(mylist, compare=operator.lt):
	if len(mylist) < 2:
		return mylist[:]
	else:
		middleIndex = int(len(mylist)/2)
		leftList = mergeSort(mylist[:middleIndex], compare)
		rightList = mergeSort(mylist[middleIndex:], compare)
		return merge(leftList, rightList, compare)
