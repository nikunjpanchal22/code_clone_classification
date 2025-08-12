def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



def capitalize_nested_reduce(t) :
    if isinstance(t, list):
        return reduce(lambda a, b : a + [capitalize_nested_reduce(b)], t, [])
    else:
        return t.capitalize()




