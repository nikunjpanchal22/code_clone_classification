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




def sublist(a, b) :
	i_a = 0
	i_b = 0
	length_a = len(a)
	length_b = len(b)
	while i_a < length_a and i_b < length_b :
		if a [i_a] == b [i_b] :
			i_a += 1
			i_b += 1
		else :
			i_b += 1
	return i_a == length_a
