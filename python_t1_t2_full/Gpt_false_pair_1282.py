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
	half = len(data)//2
	left = merge_sort(data[:half]) # takes the first half of elements
	right = merge_sort(data[half:]) # takes the last half of elements
