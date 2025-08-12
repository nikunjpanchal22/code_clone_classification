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







def merge(l1, l2):
    merged = []
    while l1 and l2:
        if l1[0] < l2[0]:
            merged.append(l1.pop(0))
        else:
            merged.append(l2.pop(0))
    merged += l1


