def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0


 def median(lst):
    sorted_list = sorted(lst)
    list_length = len(lst)

    mid = (list_length - 1) // 2
    if list_length % 2:
       return sorted_list[mid]
    else:
       return (sorted_list[mid] + sorted_list[mid + 1]) / 2.0
