def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



 def capitalize_nested(elms):
    result = []
    for elm in elms:
        if isinstance(elm, list):
            result.append(capitalize_nested(elm))
        else: 
            result.append(elm.title())


