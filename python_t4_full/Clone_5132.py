def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(a, b) :
    try:
        i = -1
        for el_a in a:
            i = b.index(el_a, i+1)
        return True


