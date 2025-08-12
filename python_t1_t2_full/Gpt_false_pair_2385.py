def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0




def median(data) :
	sorted_list = list(data)
	sorted_list.sort()
	if len(sorted_list) % 2 > 0 :
		return sorted_list [len(sorted_list) / 2]
	elif len(sorted_list) % 2 == 0 :
		return (sorted_list [(len(sorted_list) / 2)] + sorted_list [(len(sorted_list) / 2) - 1]) / 2.0

