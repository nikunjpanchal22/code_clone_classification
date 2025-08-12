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
    result = []
    
    for a, b in itertools.zip_longest(left, right, fillvalue=float('inf')):
        result.append(min(a, b))
        if a < b:
            left = left[1:]
        else : 
            right = right[1:]

    return result




