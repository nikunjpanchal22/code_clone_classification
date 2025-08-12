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
	result = []
	i, j = 0, 0
	while i < len(left) or j < len(right) :
		if (i < len(left) and j < len(right)) == false :
			if i == len(left) :
				result.extend(right [j :])
			else :
				result.extend(left [i :])
		elif left [i] >= right [j] :
			result.append(right [j])
			j += 1
		else :
			result.append(left [i])
			i += 1
	return result


