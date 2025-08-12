def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(e) :
	for y in e:
		if type(e[y]) == dict :
			e[y] = increase_by_one(e[y])
		else:
			e[y] += 1
	return e
