def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
	n_data = len(data)
	if n_data <= 1:
		return data
	middle = n_data // 2 
	left_arr = merge_sort(data[:middle])
	right_arr = merge_sort(data[middle:])
	return merge(left_arr, right_arr)


