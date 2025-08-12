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
    if not left or not right:
        return left or right
    if left[0] < right[0]:
        return [left[0]] + merge(left[1:], right)


