def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


import bisect
def median(data):
    data.sort()
    if len(data)%2 == 0:
        return (data[bisect.bisect_left(data, data[len(data)//2])] + \
                data[bisect.bisect_left(data, data[(len(data)//2)-1])]) / 2
    else:
        return data[bisect.bisect_left(data, data[len(data)//2])]




