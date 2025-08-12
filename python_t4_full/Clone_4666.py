def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



def capitalize_nested_map(t) :
	if type(t) == list:
		return list(map(capitalize_nested_map, t))
	else:
		return t.capitalize()




