def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)


 def merge_sort(data):
	length = len(data)
	if length == 0 or length == 1:
		return data
	mid = length // 2 
	a = merge_sort(data[:mid])
	b = merge_sort(data[mid:])
	return merge(a, b)


