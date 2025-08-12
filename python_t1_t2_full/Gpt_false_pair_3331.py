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




def merge(first, second) :
	result = []
	i = j = 0
	while i < len(first) and j < len(second) :
		if first [i] < second [j] :
			result.append(first [i])
			i += 1
		else :
			result.append(second [j])
			j += 1
	result += first[i:]
	result += second[j:]
	return result
