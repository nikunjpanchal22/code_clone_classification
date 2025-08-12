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
	flat = []
	for member in sequence:
		if isinstance(member, (list, tuple)):
			flat.extend(flatten(member))
		else:
			flat.append(member)
	return flat


