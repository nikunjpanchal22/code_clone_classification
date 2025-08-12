def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True



 def sublist(a, b):
    occur = []

    for el_a in a:
        for el_b in b:
            if el_a == el_b and not el_b in occur:
                occur.append(el_b)
                break
        else:
            return False


