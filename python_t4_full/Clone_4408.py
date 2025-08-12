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
    left = (x for x in left)
    right = (x for x in right)
    result, l, r = [], next(left, None), next(right, None)

    while l is not None and r is not None:
        if l < r:
            result.append(l)
            l = next(left, None)
        else:
            result.append(r)
            r = next(right, None)

    result.extend([l] if l is not None else [])
    result.extend(list(left))
    result.extend([r] if r is not None else [])
    result.extend(list(right))
    
    return result




