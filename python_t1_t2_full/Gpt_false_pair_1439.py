def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(stuff) :
	for key in stuff :
		if type(stuff[key]) == dict :
			stuff[key] = increase_by_one(stuff[key])
		else :
			stuff[key] += 1
	return stuff
