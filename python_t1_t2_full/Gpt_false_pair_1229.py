def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



 def capitalize_nested(items):
    res = []
    for item in items:
        if type(item) == list:
            res.append(capitalize_nested(item))
        else:
            res.append(item.title())
