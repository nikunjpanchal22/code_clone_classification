def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 

def median(data):
    data.sort()
    if len(data)%2==0:
        return (data[len(data)//2-1]+data[len(data)//2])/2
    else:
        return data[len(data)//2]



