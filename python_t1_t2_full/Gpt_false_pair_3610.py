def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0




def median(num_list):
	sorted_list = sorted(num_list)
	num_length = len(num_list)
	mid_index = int((num_length - 1) / 2)
	
	if(num_length % 2): 
		return sorted_list[mid_index]
	else:
		return (sorted_list[mid_index] + sorted_list[mid_index + 1]) / 2.0

