def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0


 def median(lst):
    temp_list=sorted(lst)
    length_of_list=len(lst)
    mid = (length_of_list - 1) // 2
    if length_of_list % 2:
        return temp_list[mid]
    else:
        return (temp_list[mid] + temp_list[mid + 1]) / 2.0
