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
	flat_list = []
	for element in seq:
		type_of_element = type(element)
		if type_of_element is tuple or type_of_element is list:
			for num in flatten(element):
				flat_list.append(num)
		else:
			flat_list.append(element)
	return flat_list
