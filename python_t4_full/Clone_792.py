def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0




def median(data):
  length = len(data)
  sorted_data = sorted(data)
  if length % 2 == 0:
    return (sorted_data[length // 2 - 1] + sorted_data[length // 2]) / 2.0
  return sorted_data[length // 2]


def median(data):
    lst = sorted(data)
    mid = len(lst) // 2
    if len(lst) % 2 == 0:
        return (lst[mid] + lst[mid - 1]) / 2.0
    else:
        return lst[mid]


