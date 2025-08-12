def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr) :
	if arr == []:
		return None
	else :
		frequency_list = [(item, arr.count(item)) for item in set(arr)]
		mode_elem = max(frequency_list, key=lambda x: x[1])
		return mode_elem[0]


