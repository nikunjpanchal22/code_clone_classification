def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res




def capitalize_nested_alt(t):
	res = []
	for s in t:
		if isinstance(s, list):
			res.append(capitalize_nested_alt(s))
		else:
			res.append(s.title())
	return res

