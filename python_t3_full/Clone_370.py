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
	for value in seq:
		if isinstance(value, (list, tuple)):
			result.extend(flatten(value))
		else:
			result.append(value)
	return result


