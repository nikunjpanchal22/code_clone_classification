def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data):
	data.sort()
	if len(data) % 2 == 0 :
		half = int(len(data) / 2 - 1)
		return (data[half] + data[half + 1]) / 2.0
	else:
		return data[int(len(data) / 2)]


