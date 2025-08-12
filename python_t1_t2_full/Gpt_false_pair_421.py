def flatten(xs) :
	res = []
	for x in xs :
		if isinstance(x, list) :
			res.extend(flatten(x))
		else :
			res.append(x)
	return res


 def flatten(xs):
    targ =[]
    for x in xs:
        if isinstance(x,list):
            targ = targ + flatten(x)
        else:
            targ.append(x)
    return targ
