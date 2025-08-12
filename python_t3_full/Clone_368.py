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


 def flatten(sequence):
	resultant_list = []
	for item in sequence:
		if isinstance(item, (list, tuple)):
			resultant_list.extend(flatten(item))
		else:
			resultant_list.append(item)
	return resultant_list


