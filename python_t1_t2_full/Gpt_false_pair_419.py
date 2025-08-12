def flatten(xs) :
	res = []
	for x in xs :
		if isinstance(x, list) :
			res.extend(flatten(x))
		else :
			res.append(x)
	return res


 def flatten(xs): 
    result = [] 
    for x in xs: 
        if isinstance(x, list): 
            result = result + flatten(x) 
        else: 
            result.append(x) 
    return result 
