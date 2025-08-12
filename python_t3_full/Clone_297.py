def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr) :
	if arr == []:
		return None
	else :
		most_frequent_elem = max(arr, key = arr.count)
		return most_frequent_elem


