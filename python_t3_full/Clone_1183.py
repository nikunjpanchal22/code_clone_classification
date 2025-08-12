def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
	list_length = len(data)
	if list_length == 0 or list_length == 1:
		return data
	middle = list_length // 2 
	left_data = merge_sort(data[:middle])
	right_data = merge_sort(data[middle:])
	return merge(left_data, right_data)


