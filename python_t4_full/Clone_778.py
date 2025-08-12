def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data): 
  data = sorted(data) 
  mid = int(len(data) / 2) 

  if len(data) % 2 == 0: 
    return (data[mid-1] + data[mid]) / 2.0 
  else: 
    return data[mid] 


