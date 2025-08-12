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
    lst_len = len(lst)
    index = (lst_len - 1) // 2
    if lst_len % 2:
        return temp_list[index]
    else:
        return (temp_list[index] + temp_list[index + 1]) / 2.0
