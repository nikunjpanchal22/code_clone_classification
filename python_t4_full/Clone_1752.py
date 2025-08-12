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
    leftArr = sequence[:mid] 
    rightArr = sequence[mid:] 
    if len(leftArr) > 1:
        leftSort = merge_sort(leftArr)
    if len(rightArr) > 1:
        rightSort = merge_sort(rightArr)
    return combineArray(leftSort, rightSort)


