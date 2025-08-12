def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(c, d) :
	latest = 0
 	for el_c in c :
		if el_c in d [latest :] :
			latest = d [latest :].index(el_c)
		else :
			return False
	return True
