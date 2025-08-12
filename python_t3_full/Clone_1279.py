def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(d) :
	for k, v in d.items() :
		if isinstance(v, dict):
			d[k] = increase_by_one(d[k])
		else:
			d[k] += 1
	return d


