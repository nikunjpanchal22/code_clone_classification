def sublist(a, b) :
	index_a = 0
	index_b = 0
	len_a = len(a)
	len_b = len(b)
	while index_a < len_a and index_b < len_b :
		if a [index_a] == b [index_b] :
			index_a += 1
			index_b += 1
		else :
			index_b += 1
	return index_a == len_a




def sublist(a, b):
	idx_a = 0
	idx_b = 0
	length_a = len(a)
	length_b = len(b)
	while idx_a < length_a and idx_b < length_b:
		if a[idx_a] == b[idx_b]:
			idx_a += 1
			idx_b += 1
		else:
			idx_b += 1
	return idx_a == length_a
