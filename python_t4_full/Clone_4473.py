def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


            return [left_sequence[0]] + merge(left_sequence[1:], right_sequence)
        return [right_sequence[0]] + merge(left_sequence, right_sequence[1:])
    if len(sequence) < 2:
        return sequence
    middle_index = len(sequence) // 2
    return merge(merge_sort(sequence[:middle_index]), merge_sort(sequence[middle_index:]))




def merge_sort(sequence):
    def merge(left,right):
        merged = []
        while left and right:
            if left[0] < right[0]:
                merged.append(left.pop(0))
            else:
                merged.append(right.pop(0))
        while left:
            merged.append(left.pop(0))
        while right:
            merged.append(right.pop(0))
        return merged
    


