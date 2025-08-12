def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)




def merge_sort(data) :
	if len(data) < 2 :
		return data
	mid = len(data) // 2
	left_data = merge_sort(data[:mid])
	right_data = merge_sort(data[mid:])
	return merge(left_data, right_data)

