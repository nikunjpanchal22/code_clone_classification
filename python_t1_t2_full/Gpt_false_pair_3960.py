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




def combine(arr1, arr2) :
	result = []
	i, j = 0, 0
	while i < len(arr1) and j < len(arr2) :
		if arr1 [i] < arr2 [j] :
			result.append(arr1 [i])
			i += 1
		else :
			result.append(arr2 [j])
			j += 1
	result.extend(arr1 [i :])
	result.extend(arr2 [j :])
	return result
