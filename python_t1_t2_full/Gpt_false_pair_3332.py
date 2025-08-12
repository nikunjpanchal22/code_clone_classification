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




def join(left, right) :
	combined = []
	i = j = 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			combined.append(left[i])
			i += 1
		else :
			combined.append(right[j])
			j += 1
	combined += left [i :]
	combined += right [j :]
	return combined
