def flatten(seq) :
	l = []
	for elt in seq :
		t = type(elt)
		if t is tuple or t is list :
			for elt2 in flatten(elt) :
				l.append(elt2)
		else :
			l.append(elt)
	return l



def flatten(seq):
    if seq == []:
        return seq
    if isinstance(seq[0], list):
        return flatten(seq[0]) + flatten(seq[1:])


