def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 

def median(data) :
	data.sort()
	midx = len(data) // 2
	if len(data) % 2:
		return data[midx]
	else:
		return (data[midx - 1] + data[midx]) / 2.0



