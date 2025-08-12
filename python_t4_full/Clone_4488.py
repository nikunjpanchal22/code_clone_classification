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



def merge(left, right):
	result = []	
	merged = list(itertools.chain(left, right))
	while merged:
		min_val = min(merged)
		result.append(min_val)
		merged.remove(min_val)
	return result




