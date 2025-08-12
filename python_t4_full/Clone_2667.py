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
	a_count, b_count = 0, 0
	for a_item in a:
		for b_item in b[b_count:]:
			if a_item == b_item:
				a_count+=1
				b_count = b.index(b_item)+1
				break
			elif b_item == b[-1]:
				return False
	return a_count == len(a)


