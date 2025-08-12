def flatten(xs) :
	res = []
	for x in xs :
		if isinstance(x, list) :
			res.extend(flatten(x))
		else :
			res.append(x)
	return res


 def flatten(xs):
    retn = []
    for x in xs:
        if isinstance(x,list):
            retn = retn + flatten(x)
        else:
            retn.append(x)
    return retn
