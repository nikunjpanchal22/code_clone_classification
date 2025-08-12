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
    if isinstance(seq, tuple):
        return flatten(list(seq))
    elif isinstance(seq, list):
        return sum(map(flatten, seq), [])
    else:
        return [seq]




