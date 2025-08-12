def mergeSort(L, compare = operator.lt) :
	if len(L) < 2 :
		return L [:]
	else :
		middle = int(len(L) / 2)
		left = mergeSort(L [: middle], compare)
		right = mergeSort(L [middle :], compare)
		return merge(left, right, compare)


  def mergeSort(lst, cmp = operator.lt): 
	if lst == None or len(lst) < 2: 
		return lst[:]
	else: 
		mid = len(lst)//2
		lefthalf = mergeSort(lst[:mid], cmp) 
		righthalf = mergeSort(lst[mid:], cmp)
		return merge(lefthalf, righthalf, cmp) 


