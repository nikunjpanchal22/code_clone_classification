def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data):
	n = len(data)
	data.sort()
	if n % 2 == 1:
		middle_index = int(n/2)
		median = data[middle_index]
	else:
		middle_index_1 = int(n/2) - 1
		middle_index_2 = int(n/2)
		median = (data[middle_index_1] + data[middle_index_2])/2
	return median


