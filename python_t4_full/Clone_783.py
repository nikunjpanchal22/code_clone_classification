def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data):
	if len(data) % 2 == 0:
		temp_list = sorted(data)
		middle_1 = len(data) // 2
		middle_2 = middle_1-1
		return (temp_list[middle_1] + temp_list[middle_2])/2
	elif len(data) %2 == 1 :
		length = len(data)
		temp_list = sorted(data)
		return temp_list[length // 2]


