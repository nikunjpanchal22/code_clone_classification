def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0




def median(data):
	new_list = sorted(data)
	length = len(new_list)
	index = (length - 1) // 2

	if (length % 2):
		return new_list[index]
	else:
		return (new_list[index] + new_list[index + 1])/2.0




