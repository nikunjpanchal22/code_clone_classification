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




def flatten(nested_seq):
	result_list = []
	for elt in nested_seq:
		kind_of_element = type(elt)
		if kind_of_element is tuple or kind_of_element is list:
			for new_elt in flatten(elt):
				result_list.append(new_elt)
		else:
			result_list.append(elt)
	return result_list

