def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data):
	
	data.sort()

	if len(data) % 2 == 0:
		m1 = len(data)//2
		m2 = m1 -1
		median = (data[m1] + data[m2])/2
		return median
	else:
		m3 = (len(data) - 1) // 2
		return data[m3]


