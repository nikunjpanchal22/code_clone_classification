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
    result = []
    stack = list(seq)
    while stack:
        element = stack.pop()
        if isinstance(element, (list, tuple)) :
            stack.extend(element)
        else :
            result.append(element)
    result.reverse()
    return result




