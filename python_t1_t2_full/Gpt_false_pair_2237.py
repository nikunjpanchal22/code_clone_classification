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




def merging(first, second, compare) :
	result = []
	i, j = 0, 0

	while i < len(first) and j < len(second) :
		if compare(first [i], second [j]) :
			result.append(first [i])
			i += 1
		else :
			result.append(second [j])
			j += 1

	while i < len(first) :
		result.append(first [i])
		i += 1

	while j < len(second) :
		result.append(second [j])
		j += 1

	return result
