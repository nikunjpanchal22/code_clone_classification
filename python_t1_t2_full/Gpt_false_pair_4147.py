def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(a, b) :
	last = 0
	for el_a in a :
		start_index = b[last:].find(el_a)
		if start_index != -1:
			last += start_index
		else :
			return False
	return True
