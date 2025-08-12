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
		i, j = 0, 0
		l_a, l_b = len(a), len(b)
		while True:
			if i == l_a or j == l_b:
				break
			if a[i] == b[j]:
				i += 1
			j += 1
		return i == l_a


