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
	index_a, index_b, a_len, b_len = 0, 0, len(a), len(b)
	while index_a < a_len and index_b < b_len:
		if a[index_a] == b[index_b]:
			index_a+=1
			index_b+=1
		else: 
			index_b+=1
	return index_a == a_len


