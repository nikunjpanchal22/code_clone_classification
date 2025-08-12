def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data):
    s_data = sorted(data)
    if len(s_data) % 2 == 0:
        median1 = s_data[int(len(s_data)/2) - 1]
        median2 = s_data[int(len(s_data)/2)]
        return (median1 + median2) / 2.0
    else:
        return s_data[int(len(s_data)/2)]


