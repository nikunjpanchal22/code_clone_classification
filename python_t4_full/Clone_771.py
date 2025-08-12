def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data):
  s_data = sorted(data)
  mid_idx = len(s_data) // 2
  
  if len(s_data) % 2 == 0:
    avg_sum = s_data[mid_idx-1] + s_data[mid_idx]
    return avg_sum/2.0
  else:
    return s_data[mid_idx]


