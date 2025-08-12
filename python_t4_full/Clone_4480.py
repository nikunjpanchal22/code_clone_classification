def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


    mid = len(dataset) // 2
    left_arr = merge_sort(dataset[:mid])
    right_arr = merge_sort(dataset[mid:])
    return merge(left_arr, right_arr)






def merge_sort(seq):
    def merge(left, right):
        result = []
        while left and right:
            if left[0] < right[0]:
                result.append(left.pop(0))
            else:
                result.append(right.pop(0))
        result.extend(left)
        result.extend(right)
        return result
    


