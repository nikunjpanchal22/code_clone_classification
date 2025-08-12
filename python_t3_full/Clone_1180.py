def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
    if len(data) == 1:
        return data

    mid = len(data)//2
    left_side = data[:mid]
    right_side = data[mid:]

    sorted_left = merge_sort(left_side)
    sorted_right = merge_sort(right_side)

    return merge(sorted_left, sorted_right)
    


