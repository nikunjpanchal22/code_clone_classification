def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


	left = merge_sort(left)
	right = merge_sort(right)
	return list(merge(left, right))




def merge_sort(input_array):
    def merge(left, right):
        result = []
        while left and right:
            min_element = left.pop(0) if left[0]<=right[0] else right.pop(0)
            result.append(min_element)
        result.extend(left)
        result.extend(right)
        return result

    if len(input_array) < 2:
        return input_array


