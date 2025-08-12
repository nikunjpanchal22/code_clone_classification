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
    uniq = []
    return [uniq.append(i) for i in x if i not in uniq]


