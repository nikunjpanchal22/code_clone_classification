def merge(x) :
	if len(x) == 1 :
		return x
	else :
		mid = int(len(x) / 2)
		l = merge(x [: mid])
		r = merge(x [mid :])
	i = j = 0
	result = []
	while i < len(l) and j < len(r) :
		if l [i] < r [j] :
			result.append(l [i])
			i += 1
		else :
			result.append(r [j])
			j += 1
	result += l [i :]
	result += r [j :]
	return result





def merge(x):
	if len(x) > 1:
		mid = len(x) // 2
		left = x[:mid]
		right = x[mid:]
		merge(left)
		merge(right)
		i = j = k = 0
		while i < len(left) and j < len(right):
			if left[i] < right[j]:
				x[k] = left[i]
				i += 1
			else:
				x[k] = right[j]
				j += 1


