def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data): 
	data.sort() 
	length = len(data)
	if length % 2 == 1 :  
		return data[length // 2] 
	else : 
		return (data[(length // 2) - 1] + data[length // 2]) / 2


