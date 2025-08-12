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




def merge(list1, list2) :
	result = []
	i, j = 0, 0
	while i < len(list1) and j < len(list2) :
		if list1 [i] < list2 [j] :
			result.append(list1 [i])
			i += 1
		else :
			result.append(list2 [j])
			j += 1
	result.extend(list1 [i :])
	result.extend(list2 [j :])
	return result

