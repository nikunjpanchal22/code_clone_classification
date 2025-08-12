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




def merge_4(left, right):
	result = []
	i = j = 0
	length1 = len(left)
	length2 = len(right)
	while i < length1 and j < length2 :
		if left[i] < right[j] :
			result.append(right[j])
			j += 1
		else :
			result.append(left[i])
			i += 1
	result += left [i :]
	result += right [j :]
	return result
