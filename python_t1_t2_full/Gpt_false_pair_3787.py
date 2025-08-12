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




def merge(left, right) :
	result = []
	i = j = 0
	while i < len(left) and j < len(right) :
		if left [j] < right [i] :
			result.append(left [j])
			j += 1
		else :
			result.append(right [i])
			i += 1
	result += left [j :]
	result += right [i :]
	return result
