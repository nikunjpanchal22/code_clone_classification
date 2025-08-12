def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


  def median(data):
	n = len(data)
	data.sort()
	if n % 2 == 0:
		m1 = data[n//2]
		m2 = data[n//2 - 1]
		median = (m1+m2)/2
	else:
		median = data[n//2]
 
	return median


