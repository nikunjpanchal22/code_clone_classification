def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
	num_data = len(data)
	if num_data == 0 or num_data == 1:
		return data
	middle = num_data // 2
	left_list = merge_sort(data[:middle])
	right_list = merge_sort(data[middle:])
	return merge(left_list, right_list)


