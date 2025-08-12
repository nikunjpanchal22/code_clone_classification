def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data):
    data_list = sorted(data) 
    if len(data_list) % 2 > 0:
        return data_list[len(data_list)//2] 
    else:
        return (data_list[len(data_list)//2] + data_list[len(data_list)//2 - 1]) / 2.0


def median(data):
    sorted_list = sorted(data)


