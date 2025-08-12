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
	b_index = 0
	for index_a in range(len(a)): 
		while b_index < len(b): 
			if a[index_a] == b[b_index]:
				b_index += 1
				break 
			else: 
				b_index += 1
		if b_index == len(b): 
			return False
	return True


