def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0




def median(numbers):
	num_list = sorted(numbers)
	list_length = len(numbers)
	index_position = int((list_length - 1) / 2)

	if(list_length % 2):
		return num_list[index_position]
	else:
		return (num_list[index_position] + num_list[index_position + 1]) / 2.0
