def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data) :
    list_data = sorted(data)
    middle_number = len(list_data) // 2
    if len(list_data) % 2 > 0 :
        return list_data[middle_number]
    elif len(list_data) % 2 == 0 :
        return (list_data[middle_number] + list_data[middle_number - 1]) / 2.0


