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



def merge(left, right):
    result = [left[i] if left[i] < right[j] else right[j] for i in range(len(left)) for j in range(len(right))]
    result.extend(left[len(result)//2:])
    result.extend(right[len(result)//2:])
    return result




