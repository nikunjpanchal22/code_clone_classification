def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


 def merge_sort(sequence): 
    if len(sequence) < 2 : 
        return sequence
    mid = len(sequence) // 2
    left_sequence = sequence[:mid] 
    right_sequence = sequence[mid:] 
    if len(left_sequence) > 1:
        left_sequence = merge_sort(left_sequence)
    if len(right_sequence) > 1:
        right_sequence = merge_sort(right_sequence)
    return merge(left_sequence, right_sequence)


