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
    for _ in range(len(left) + len(right)):
        if not left:
            result.append(right.pop(0))
        elif not right:
            result.append(left.pop(0))
        elif left[0] < right[0]:
            result.append(left.pop(0))
        else:
            result.append(right.pop(0))


