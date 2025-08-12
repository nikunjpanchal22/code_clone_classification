def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


 def median(data):
  data_sorted = sorted(data)
  length_data = len(data_sorted)
  if length_data % 2 == 0:
    middel_left = length_data /2 -1 
    middel_right = length_data/2
    return (data_sorted[middel_left] + data_sorted[middel_right])/2.0
  else:
    return data_sorted[length_data/2]


