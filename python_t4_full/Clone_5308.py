def unique(x) :
	output = []
	y = {}
	for item in x :
		y [item] = ""
	for item in x :
		if item in y :
			output.append(item)
	return output




def unique(x):
    result = []
    return [result.append(n) for n in x if n not in result]


