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
	if len(x) <= 1: 
		return x
	mid = len(x) // 2
	left, right = x[:mid], x[mid:]
	return sorted(merge(left) + merge(right))


