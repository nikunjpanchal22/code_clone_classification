def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data) : 
	length = len(data) 
	if length <= 1 :
		return data
	middle = length // 2 
	first_half = merge_sort(data[:middle])
	second_half = merge_sort(data[middle:])
	return merge(first_half, second_half)


