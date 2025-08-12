def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data):
  sorted_data = sorted(data)
  mid_ctr = int(len(sorted_data)/2)
  if len(sorted_data) % 2 == 0:
    return (sorted_data[mid_ctr-1] + sorted_data[mid_ctr])/2.0
  else:
    return sorted_data[mid_ctr]


