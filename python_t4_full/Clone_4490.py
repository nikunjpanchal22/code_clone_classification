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
    result, l, r = [], 0, 0
    while l < len(left) and r < len(right):
        if left[l] < right[r]: result.append(left[l]); l += 1
        else: result.append(right[r]); r += 1


