def mode(arr) :
	if arr == [] :
		return None
	else :
		return max(set(arr), key = arr.count)


 def mode(arr):
	if arr == []:
		return None
	else:
		max_num = max(arr)
		max_num_occurence = arr.count(max_num)
		for num in arr:
			if arr.count(num) > max_num_occurence:
				max_num = num
				max_num_occurence = arr.count(num)
		return max_num


