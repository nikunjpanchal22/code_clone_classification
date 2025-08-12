def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data) : 
	if len(data) <= 1 :
		return data
	midpoint = len(data) // 2 
	left_side = merge_sort(data[:midpoint])
	right_side = merge_sort(data[midpoint:])
	return merge(left_side, right_side)
