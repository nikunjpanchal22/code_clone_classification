def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b) :
	i = 0
	for el_a in a :
		if el_a in b[i:] :
			index_b = b[i:].index(el_a)
			i += index_b + 1
		else :
			return False
	return True
