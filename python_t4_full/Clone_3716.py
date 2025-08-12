def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


    if len_list % 2 == 0:
        return (sorted_list[(len_list-1)//2] + sorted_list[(len_list+1)//2]) / 2.0
    else:
        return sorted_list[(len_list-1)//2]




def median(data):
	data = sorted(data)
	n = len(data)


