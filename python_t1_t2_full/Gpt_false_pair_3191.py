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




def sublist(list_a, list_b) :
	index_a = 0
	index_b = 0
	len_a = len(list_a)
	len_b = len(list_b)
	while index_a < len_a and index_b < len_b :
		if list_a [index_a] == list_b [index_b] :
			index_a += 1
			index_b += 1
		else :
			index_b += 1
	return index_a == len_a
