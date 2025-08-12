def split_at_first_false(pred, seq) :
	index = 0
	while index < len(seq) :
		if not pred(seq [index]) :
			return seq [: index], seq [index + 1 :]
		index += 1


 def split_at_first_false(pred, seq) :
	subList = []
	result = []
	for elem in seq :
		if pred(elem):
			subList.append(elem)
		else :
			subList.append(elem)
			result.append(subList)
			subList = []
	return result[0], result[1]


