def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



 def capitalize_nested(data):
    output = []
    for x in data:
        if type(x) == list:
            output.append(capitalize_nested(x))
        else:
            output.append(x.capitalize())
