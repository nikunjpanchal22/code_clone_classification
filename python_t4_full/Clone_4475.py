def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


        return merged_sequence + left_sequence + right_sequence
    if len(sequence) < 2:
        return sequence[:]
    middle_index = len(sequence) // 2
    return merge(merge_sort(sequence[:middle_index]), merge_sort(sequence[middle_index:]))




def merge_sort(sequence):
    def merge(left_sequence, right_sequence):
        if not left_sequence:
            return right_sequence
        if not right_sequence:
            return left_sequence


