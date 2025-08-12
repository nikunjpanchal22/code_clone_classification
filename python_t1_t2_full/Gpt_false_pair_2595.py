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




def flatten(seq) :
	items = []
	for elem in seq :
		t = type(elem)
		if t is tuple or t is list :
			for item in flatten(elem) :
				items.append(item)
		else :
			items.append(elem)
	return items

