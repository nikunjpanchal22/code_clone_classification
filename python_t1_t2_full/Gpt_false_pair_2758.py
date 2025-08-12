def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res




def capitalize_nested_alt2(t):
	res = []
	for s in t:
		if isinstance(s, list):
			res.append(capitalize_nested_alt2(s))
		else:
			res.append(s.upper())
	return res
