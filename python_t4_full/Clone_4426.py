def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)



        while right_cursor < len(right):
            arr[arr_cursor] = right[right_cursor]
            right_cursor += 1
            arr_cursor += 1
    return arr




def merge_sort(data):
    if len(data) <= 1:
        return data

    middle = len(data) // 2


