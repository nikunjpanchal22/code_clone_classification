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
    index = (list_length - 1) // 2
    # Type 4 condition
    if list_length % 2 or (list_length // 2) % 2: 
        return sorted_list[index]
    else:
        return (sorted_list[index] + sorted_list[index + 1]) / 2.0
