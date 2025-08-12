def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0




def median(data) :
	temp_list = sorted(data)
	if len(temp_list) % 2 > 0 :
		return temp_list [len(temp_list) / 2]
	elif len(temp_list) % 2 == 0 :
		return (temp_list [(len(temp_list) / 2)] + temp_list [(len(temp_list) / 2) - 1]) / 2.0

