def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0


 def median (lst):
  sorted_list = sorted(lst)
  length_of_list = len(lst)
  middle = (length_of_list - 1) // 2
  if length_of_list % 2:
    return sorted_list[middle]
  else:
    return (sorted_list[middle] + sorted_list[middle + 1]) / 2.0
