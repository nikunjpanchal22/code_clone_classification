def merge_sort(data) :
	if len(data) == 1 :
		return data
	middle = len(data) / / 2
	left_data = merge_sort(data [: middle])
	right_data = merge_sort(data [middle :])
	return merge(left_data, right_data)




def merge_sort(sequence) :
	if len(sequence) == 1 :
		return sequence
	center = len(sequence) // 2
	left_sequence = merge_sort(sequence[:center])
	right_sequence = merge_sort(sequence[center:])
	return merge(left_sequence, right_sequence)
