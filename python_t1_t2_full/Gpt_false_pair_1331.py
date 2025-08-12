def merge(left, right, compare) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if compare(left [i], right [j]) :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	while i < len(left) :
		result.append(left [i])
		i += 1
	while j < len(right) :
		result.append(right [j])
		j += 1
	return result


 def merge(left, right, comparator):
	result = []
	leftIdx, rightIdx = 0, 0

	while leftIdx < len(left) and rightIdx < len(right):
		if comparator(left[leftIdx], right[rightIdx]):
			result.append(left[leftIdx])
			leftIdx +=1
		else:
			result.append(right[rightIdx])
			rightIdx +=1

	for i in range(leftIdx, len(left)):
		result.append(left[i])

	for i in range(rightIdx, len(right)):
		result.append(right[i])

	return result
