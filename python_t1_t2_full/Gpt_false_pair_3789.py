def merge(left, right) :
	result = []
	i = j = 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result += left [i :]
	result += right [j :]
	return result




def merge(l, r) :
	res = []
	i, j = 0, 0
	while i < len(l) and j < len(r) :
		if l [i] < r [j] :
			res.append(l [i])
			i += 1
		else :
			res.append(r [j])
			j += 1
	res += l [i :]
	res += r [j :]
	return res
