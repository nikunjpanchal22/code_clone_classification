def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)





def merge_sort(sequence):
    import heapq
    seq = merge_sort(sequence)
    if len(sequence) < 2:
        return sequence
    else:
        middle = len(sequence) // 2


