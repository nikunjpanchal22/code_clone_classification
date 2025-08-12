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




def merge(lst1, lst2) :
	result = []
	i, j = 0, 0
	while i < len(lst1) and j < len(lst2) :
		if lst1 [i] < lst2 [j] :
			result.append(lst1 [i])
			i += 1
		else :
			result.append(lst2 [j])
			j += 1
	result.extend(lst1 [i :])
	result.extend(lst2 [j :])
	return result
