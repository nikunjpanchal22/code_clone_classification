def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data):
    s_data = sorted(data)
    
    if len(s_data) % 2 == 0:
        mid_idx = len(s_data) // 2
        return (s_data[mid_idx-1] + s_data[mid_idx]) / 2.0
    else:
        mid_idx = (len(s_data) -1) // 2
        return s_data[mid_idx]


