def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(d) :
	for key, value in d.items():
		if type(value) == dict:
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


