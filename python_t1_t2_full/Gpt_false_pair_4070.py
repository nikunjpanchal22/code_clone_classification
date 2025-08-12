def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(a, b):
    last = 0
    for el_a in a:
        if el_a in b[last:]:
            last_index = b.index(el_a, last)
            last = last_index + 1
        else:
            return False
    return True

