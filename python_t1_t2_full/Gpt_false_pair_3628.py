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




def merge(left, ryt) :
	reslt = []
	a, b = 0, 0
	while a < len(left) and b < len(ryt) :
		if left [a] < ryt [b] :
			reslt.append(left [a])
			a += 1
		else :
			reslt.append(ryt [b])
			b += 1
	reslt.extend(left [a :])
	reslt.extend(ryt [b :])
	return reslt
