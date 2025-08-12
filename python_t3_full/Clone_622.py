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
    lst_len = len(lst)
    mid = (lst_len - 1) / 2
    if lst_len % 2:
        return lst[mid]
    else:
        return (lst[mid] + lst[mid + 1]) / 2.0


