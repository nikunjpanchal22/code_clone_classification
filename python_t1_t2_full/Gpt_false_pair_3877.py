def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d




def multiply_n_value(d):
	for key in d:
		if type(d[key]) == dict:
			d[key] = multiply_n_value(d[key])
		else:
			d[key] *= 2
	return d

