def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res




def upper_nested(t):
	result = []
	for sent in t :
		if type(sent) == list :
			result.append(upper_nested(sent))
		else :
			result.append(sent.upper())
	return result

