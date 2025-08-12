def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data):
	
	data_sorted = sorted(data)
	length = len(data_sorted)
 
	if length % 2 == 0:
		median_value = (data_sorted[length // 2] + data_sorted[length // 2 - 1]) / 2
		return median_value
	else:
		median_value = data_sorted[length // 2]
		return median_value


