def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0


 def median(lst):
    lst.sort()
    list_length = len(lst)
    index = (list_length - 1) // 2
    if list_length % 2:
        return lst[index]
    else:
        return (lst[index] + lst[index + 1]) / 2.0


