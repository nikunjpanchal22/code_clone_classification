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
		element_in_b = False 
		for el_b in b[last:] :
			if el_a == el_b :
				element_in_b = True
				last = b.index(el_b)
				break
		if not element_in_b :
			return False
	return True


