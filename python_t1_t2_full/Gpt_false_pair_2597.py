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




def flatten_sequence(seq): 
	result = []
	for item in seq :
		el_type = type(item)
		if el_type is tuple or el_type is list :
			for sub_item in flatten_sequence(item) :
				result.append(sub_item)
		else :
			result.append(item)
	return result
