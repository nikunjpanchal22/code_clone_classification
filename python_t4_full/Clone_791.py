def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0




def median(data):
    sorted_data = sorted(data)
    result = 0
    length = len(sorted_data)
    
    if length % 2 > 0:
        result = sorted_data[length // 2]
    else:
        result = (sorted_data[length // 2] + sorted_data[(length // 2) - 1]) / 2.0


