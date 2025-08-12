def unique(x) :
	output = []
	y = {}
	for item in x :
		y [item] = ""
	for item in x :
		if item in y :
			output.append(item)
	return output




def unique(x) :
	output = []
	y = set()
	for item in x :
		y.add(item)
	for item in x :
		if item in y :
			output.append(item)
	return output

