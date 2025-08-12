def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data) :
    new_list = sorted(data[:])
    mid_index = len(new_list) // 2
    if len(new_list) % 2 == 0 :
        return (new_list[mid_index] + new_list[mid_index - 1]) / 2.0
    elif len(new_list) % 2 > 0 :
        return new_list[mid_index]


