def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True



 def sublist(a, b):
    if len(b) < len(a):
	    return False
    for el in a:
		if el not in b:
			return False	


