def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
	m = 0
	for e in a:
		if e not in b[m:]:
			return False
		else:
			m = b.index(e, m)+1
	return True


