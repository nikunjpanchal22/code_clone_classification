def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d




def increase_by_one_for_each_key(d):
	for key in d:
		if type(d[key]) == dict:
			d[key] = increase_by_one_for_each_key(d[key])
		else:
			d[key] += 2
	return d

