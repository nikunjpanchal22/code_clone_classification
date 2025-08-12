def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0




def median(data) :
	ascending_list = sorted(data, reverse=False)
	if len(ascending_list) % 2 > 0 :
		return ascending_list [len(ascending_list) / 2]
	elif len(ascending_list) % 2 == 0 :
		return (reverse_list [(len(ascending_list) / 2)] + reverse_list [(len(ascending_list) / 2) - 1]) / 2.0
