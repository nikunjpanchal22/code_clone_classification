def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


    return d

 

def increase_by_one(d):
    for k in d.copy():
        if isinstance(d[k], dict):
            d[k] = increase_by_one(d[k])


