def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)




def merge_sort_type4(dataset) :
	if(len(dataset) == 1) :
		return dataset
	mid = len(dataset) // 2
	left_array = merge_sort_type4(dataset[:mid])
	right_array = merge_sort_type4(dataset[mid:])
	return merge(left_array, right_array)
