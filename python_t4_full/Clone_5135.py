def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 

def sublist(a, b):
    b_index = 0
    for el in a:
        if el not in b[b_index:]:
            return False
        b_index += b[b_index:].index(el) + 1


