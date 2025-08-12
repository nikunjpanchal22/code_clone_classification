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
    middle = len(sequence) // 2
    left_sequence = sequence[:middle] 
    right_sequence = sequence[middle:] 
    
    if len(left_sequence)>1:
        mergeSortLeft = merge_sort(left_sequence)
    if len(right_sequence)>1:
        mergeSortRight = merge_sort(right_sequence)
    return merge(mergeSortLeft, mergeSortRight)


