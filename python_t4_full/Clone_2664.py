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
	a_index = 0
	b_num = 0
	for item_a in a: 
		found_match = False
		while b_num < len(b):
			if item_a == b[b_num]:
				found_match = True
				break
			else: 
				b_num += 1
		if found_match is False: 
			return False
		else: 
			a_index += 1
	return True


