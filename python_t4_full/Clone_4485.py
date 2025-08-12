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
	result = [] 
	i, j = iter(left), iter(right)
	x, y = next(i, None), next(j, None)
	while x is not None and y is not None:
		if x < y:
			result.append(x)
			x = next(i, None)
		else:
			result.append(y)
			y = next(j, None)
	result += list(i) + list(j)
	return result




