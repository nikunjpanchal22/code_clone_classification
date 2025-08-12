def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data):
	temp = sorted(data)
	length = len(temp)

	if length % 2 == 0:
		index = int(length / 2)
		return (temp[index - 1] + temp[index]) / 2
	else:
		index = int((length - 1) / 2)
		return temp[index]


