def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
	if len(data) == 1 or len(data) == 0:
		return data
	div = len(data) // 2
	x = merge_sort(data[:div])
	y = merge_sort(data[div:])
	return merge(x, y)
