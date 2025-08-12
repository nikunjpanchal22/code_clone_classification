def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



 def capitalize_nested(elements):
    res = []
    for el in elements:
        if type(el) == list:
            res.append(capitalize_nested(el))
        else:
            res.append(el.title())
