def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0




def median(data) :
	list_sort = sorted(data)
	if len(list_sort) % 2 > 0 :
		return list_sort [len(list_sort) / 2]
	elif len(list_sort) % 2 == 0 :
		return (list_sort [(len(list_sort) / 2)] + list_sort [(len(list_sort) / 2) - 1]) / 2.0
