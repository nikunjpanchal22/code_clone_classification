def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


def median(data):
  data_list = sorted(data)
  mid = len(data_list) // 2

  if len(data_list) % 2 == 0:
    return (data_list[mid-1] + data_list[mid]) / 2.0
  else:
    return data_list[mid]


