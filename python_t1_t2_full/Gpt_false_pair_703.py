def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0


 def median(lst):
    sorted_lst = sorted(lst)
    list_len = len(lst)
    mid = (list_len - 1) // 2
    if list_len % 2:
        return sorted_lst[mid]
    else:
        return (sorted_lst[mid] + sorted_lst[mid + 1]) / 2.0
