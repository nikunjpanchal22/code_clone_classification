def consec(n, iterable) :
	result = set()
	prev = None
	count = 0
	for item in iterable :
		if item == prev :
			count += 1
			if count == n :
				result.add(prev)
		else :
			prev = item
			count = 1
	return result




def consec(n, iterable) :
	result = set()
	prev = None
	count = 0
	for val in iterable:
		if val == prev:
			count += 1
			if count == n:
				result.add(prev)
		else:
			prev = val
			count = 1
	return result

