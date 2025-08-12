def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data) :
    sorted_list = sorted(data)
    mid_point = len(sorted_list) // 2
    if len(sorted_list) % 2 == 0 :
        return (sorted_list[mid_point] + sorted_list[mid_point - 1]) / 2
    else :
        return sorted_list[mid_point]


