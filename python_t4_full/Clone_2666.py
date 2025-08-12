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
	a_index, b_index = 0, 0
	while a_index < len(a) and b_index < len(b):
		if a[a_index] == b[b_index]:
			a_index += 1
			b_index += 1
			if a_index == len(a): 
				return True
		else:
			b_index += 1
	return False


