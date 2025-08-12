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




def combine(left, right) :
	merged = []
	i = j = 0 
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			merged.append(left[i])
			i += 1
		else :
			merged.append(right[j])
			j += 1
	merged += left [i :]
	merged += right [j :]
	return merged

