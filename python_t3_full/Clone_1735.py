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
	id_a, id_b, length_a, length_b = 0, 0, len(a), len(b) 
	while id_a < length_a and id_b < length_b: 
		if a[id_a] == b[id_b]: 
			id_a += 1 
			id_b += 1 
		else: 
			id_b += 1 
	return id_a == length_a


