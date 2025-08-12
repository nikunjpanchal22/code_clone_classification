def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



 def capitalize_nested(things):
    output = []
    for element in things:
        if type(element) == list:
            output.append(capitalize_nested(element))
        else:
            output.append(element.capitalize())
