def merge(left, right) :
	result = []
	i = j = 0
	while i < len(left) and j < len(right) :
		if left [i] < right [j] :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	result += left [i :]
	result += right [j :]
	return result



def merge(left, right):
    if not left or not right: return left + right
    return [left[0]] + merge(left[1:], right) if left[0] < right[0] else [right[0]] + merge(left, right[1:])




