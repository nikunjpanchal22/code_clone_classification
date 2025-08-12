def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data) :
    new_list = list(data).sort() 
    mid_val = len(new_list) // 2
    if len(new_list) % 2 == 0 :
        return (new_list[mid_val] + new_list[mid_val - 1]) / 2
    elif len(new_list) % 2 > 0 :
        return new_list[mid_val]


