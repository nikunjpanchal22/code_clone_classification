def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
	if len(data) == 0 or len(data) == 1:
		return data
	split = int(len(data) / 2)
	data1 = merge_sort(data[:split])
	data2 = merge_sort(data[split:])
	return merge(data1, data2)


