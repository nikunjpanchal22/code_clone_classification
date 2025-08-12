def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data):
    new_list = sorted(data)
    if len(new_list) % 2 == 0:
        mid_idx = int(len(new_list) / 2)
        return (new_list[mid_idx-1] + new_list[mid_idx]) / 2.0
    else:
        mid_idx = int(len(new_list) / 2) 
        return new_list[mid_idx] 


