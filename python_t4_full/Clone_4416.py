def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


        right = sort_merge(input_list[mid:])
        return merge(left, right)




def sorter(arr) :
    if len(arr) <= 1 :
        return arr
    else :
        mid = len(arr) // 2


