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
	res = [] 
	l = 0
	r = 0
	while l < len(left) and r < len(right): 
		if left[l] < right[r]: 
			res.append(left[l]) 
			l += 1
		else: 
			res.append(right[r]) 
			r += 1
	res.extend(left[l:]) 
	res.extend(right[r:]) 
	return res

