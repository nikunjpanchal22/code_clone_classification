def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res




def intern_nested(t):
	res = []
	for sample in t :
		if type(sample) == list :
			res.append(intern_nested(sample))
		else :
			res.append(sample.title())
	return res
