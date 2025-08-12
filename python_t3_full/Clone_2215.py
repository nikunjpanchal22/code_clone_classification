def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


        return sortedArr




def sort_merge(input_list):
    if len(input_list) == 1:
        return input_list
    else:
        mid = len(input_list) // 2


