def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data) :
        if not data :
            return None     
        data.sort()
        mid = len(data) // 2
        if len(data) % 2:
            return data[mid]
        else:
            return float(sum(data[mid-1:mid+1])) / 2.0 


