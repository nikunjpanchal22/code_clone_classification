def merge(left, right) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result.extend(left [i :])
	result.extend(right [j :])
	return result




def merge(left, right) :
	res = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			res.append(left [i])
			i += 1
		else :
			res.append(right [j])
			j += 1
	res.extend(left [i :])
	res.extend(right [j :])
	return res

