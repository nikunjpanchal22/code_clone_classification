def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(data) :
	for item in data :
		if type(data[item]) == dict:
			data[item] = increase_by_one(data[item])
		else :
			data[item] += 1
	return data
