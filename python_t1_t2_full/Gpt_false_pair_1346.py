def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


 def mergeSort(Lst, compare= operator.lt) : 
  
    if len(Lst) < 2 : 
        return Lst[:] 
    else : 
        middle = len(Lst) // 2
        left = mergeSort(Lst[:middle], compare) 
        right = mergeSort(Lst[middle:], compare)
        return merge(left, right, compare) 
