def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



def capitalize_nested_gen(t):
    for s in t:
        if isinstance(s,list):
            yield list(capitalize_nested_gen(s))
        else: 
            yield s.capitalize()




