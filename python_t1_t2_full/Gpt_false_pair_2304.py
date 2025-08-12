def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)




def merge_sort_type3(data) :
	if(len(data) == 1) :
		return data
	mid = len(data) // 2
	left_chunk = merge_sort_type3(data[:mid])
	right_chunk = merge_sort_type3(data[mid:])
	return merge(left_chunk, right_chunk)

