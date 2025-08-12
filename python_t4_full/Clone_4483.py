def merge_sort(sequence) :
	if len(sequence) < 2 :
		return sequence
	mid = len(sequence) / / 2
	left_sequence = merge_sort(sequence [: mid])
	right_sequence = merge_sort(sequence [mid :])
	return merge(left_sequence, right_sequence)






from heapq import merge

def merge_sort(m):
	if len(m) <= 1:
		return m
	middle = len(m) // 2
	left = m[:middle]


