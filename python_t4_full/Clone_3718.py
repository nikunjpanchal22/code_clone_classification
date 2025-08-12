def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0





def median(data):
    data = sorted(data)
    n = len(data)
    m = n - 1
    return (data[m // 2] + data[n // 2]) / 2


