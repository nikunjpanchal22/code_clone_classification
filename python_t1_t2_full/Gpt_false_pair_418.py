def flatten(xs) :
	res = []
	for x in xs :
		if isinstance(x, list) :
			res.extend(flatten(x))
		else :
			res.append(x)
	return res


 def flatten(xs):
    flat = []
    for x in xs:
        if isinstance(x, list):
            for y in flatten(x):
                flat.append(y)
        else:
            flat.append(x)
    return flat
