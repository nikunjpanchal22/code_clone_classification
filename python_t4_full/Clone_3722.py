def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0



def median(data):
    length = len(data)
    return sorted(data)[length // 2] if length % 2 != 0 else (sorted(data)[length // 2] + sorted(data)[(length // 2) - 1]) / 2




