def median(lst) :
	sortedLst = sorted(lst)
	lstLen = len(lst)
	index = (lstLen - 1) / / 2
	if (lstLen % 2) :
		return sortedLst [index]
	else :
		return (sortedLst [index] + sortedLst [index + 1]) / 2.0


 def median(lst):
     list_sorted = sorted(lst)
     len_list = len(lst)
     if len_list % 2:
         return list_sorted[(len_list - 1) // 2]
     else:
         return (list_sorted[(len_list - 1) // 2] + list_sorted[len_list // 2]) / 2.0


