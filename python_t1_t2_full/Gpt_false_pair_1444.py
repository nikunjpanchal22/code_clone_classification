def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(elements) :
	for entry in elements :
		if type(elements[entry]) == dict :
			elements[entry] = increase_by_one(elements[entry])
		else :
			elements[entry] += 1
	return elements
