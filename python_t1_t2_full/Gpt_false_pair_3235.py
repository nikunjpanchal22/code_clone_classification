def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(m, n) :
	end = 0
	for el_m in m :
		if el_m in n [end :] :
			end = n [end :].index(el_m)
		else :
			return False
	return True
