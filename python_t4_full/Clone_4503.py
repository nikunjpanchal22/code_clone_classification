def merge(left, right, compare) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if compare(left [i], right [j]) :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	while i < len(left) :
		result.append(left [i])
		i += 1
	while j < len(right) :
		result.append(right [j])
		j += 1
	return result


			result += [right[j]]
			j += 1
	result += left[i:]
	result += right[j:]
	return result




def merge(left, right, compare):
	result = []
	while left or right:
		if len(left) and len(right):
			if compare(left[0], right[0]):
				result.append(left.pop(0))


