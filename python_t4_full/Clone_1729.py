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
    length = len(data)

    midpoint = length//2
    left_half = data[0:midpoint]
    right_half = data[midpoint:length]
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)
    return merge(left_half, right_half)
    


