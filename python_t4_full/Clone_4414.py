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




def merge_lists(a, b):
    merged = []
    while a and b:
        if a[0] < b[0]: merged.append(a.pop(0))
        else: merged.append(b.pop(0))
    merged += a
    merged += b
    return merged




