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
	a_i = 0
	for item in b: 
		if a_i < len(a) and a[a_i] == item: 
			a_i+=1
	return a_i == len(a)


