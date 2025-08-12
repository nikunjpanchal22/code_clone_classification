def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0


 def median(lst):
    temp_list = sorted(lst)
    list_len = len(lst)
    mid = list_len // 2
    if not list_len % 2:
        return (temp_list[mid - 1] + temp_list[mid]) / 2.0
    else:
        return temp_list[mid]


