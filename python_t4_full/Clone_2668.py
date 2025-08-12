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
	index = 0
	for item_a in a: 
		for item_b in range(index, len(b)): 
			if item_a == b[item_b]:
				index = item_b + 1
				break
			elif item_b == len(b) - 1:
				return False
	return True


