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


 def flatten(input_list):
	result = []
	for element in input_list:
		if isinstance(element, (tuple, list)):
			result.extend(flatten(element))
		else:
			result.append(element)
	return result


