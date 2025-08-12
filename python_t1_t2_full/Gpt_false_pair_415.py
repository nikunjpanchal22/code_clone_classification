def flatten(xs) :
	res = []
	for x in xs :
		if isinstance(x, list) :
			res.extend(flatten(x))
		else :
			res.append(x)
	return res


 def flatten(xs):
    res = []
    for x in xs:
        if isinstance(x, list):
            for y in x:
                res.append(y)
        else:
            res.append(x)
    return res
