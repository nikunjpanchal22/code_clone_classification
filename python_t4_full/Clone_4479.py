def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)


        return seq
    middle = len(seq) // 2
    left = merge_sort(seq[:middle])
    right = merge_sort(seq[middle:])
    return merge(left, right)






def merge_sort(arr):
	if len(arr) > 1:
		mid = len(arr) // 2
		left_half = arr[:mid]
		right_half = arr[mid:]

		left_half = merge_sort(left_half)
		right_half = merge_sort(right_half)

		arr = []

		while len(left_half) > 0 and len(right_half) > 0:
			if left_half[0] < right_half[0]:
				arr.append(left_half[0])


