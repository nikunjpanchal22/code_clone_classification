def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data) :
    new_list =data.copy()
    new_list.sort()
    if len(new_list) % 2 > 0 :
        return new_list [len(new_list) // 2]
    else :
        return (new_list [(len(new_list) // 2)] + new_list [(len(new_list) // 2) - 1]) / 2.0


