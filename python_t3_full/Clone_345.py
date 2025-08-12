def flatten(xs) :
	res = []
	for x in xs :
		if isinstance(x, list) :
			res.extend(flatten(x))
		else :
			res.append(x)
	return res


 def flatten(xs):
    output = []
    for x in xs:
        if type(x) == list:
            for y in x:
                output.append(y)
        else:
            output.append(x)
    return output


