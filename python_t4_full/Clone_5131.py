def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(a, b):
    b = iter(b)
    return all(any(b_val == a_val for b_val in b) for a_val in a)



def sublist(a, b):
    last = 0


