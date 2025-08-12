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
	flattened = []
	for item in sequence:
		if isinstance(item, (list,tuple)):
			flattened.extend(flatten(item))
		else:
			flattened.append(item)
	return flattened


