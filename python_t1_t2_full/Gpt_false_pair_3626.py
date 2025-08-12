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




def merge(lft, rght) :
	res = []
	i, j = 0, 0
	while i < len(lft) and j < len(rght) :
		if lft [i] < rght [j] :
			res.append(lft [i])
			i += 1
		else :
			res.append(rght [j])
			j += 1
	res.extend(lft [i :])
	res.extend(rght [j :])
	return res
