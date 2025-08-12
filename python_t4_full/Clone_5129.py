def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


            return False
    return True

 

def sublist(a, b):
    start = 0
    for a_value in a:
        for idx, b_value in enumerate(b[start:], start=start):
            if a_value == b_value:
                start = idx + 1


