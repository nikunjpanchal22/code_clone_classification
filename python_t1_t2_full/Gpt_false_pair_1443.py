def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(mod) :
	for thing in mod :
		if type(mod[thing]) == dict :
			mod[thing] = increase_by_one(mod[thing])
		else :
			mod[thing] += 1
	return mod
