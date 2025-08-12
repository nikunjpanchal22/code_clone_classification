def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


    return all(i in b_iter for i in a)



def sublist(a, b):
    index = 0
    for i in a:
        if i in b[index:]:
            index += b[index:].index(i) + 1


