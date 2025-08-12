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
	for index, item in enumerate(iterable) :
		if item == prev :
			count += 1
			if count == n :
				result.add(prev)
		else :
			if index > 0 :
				prev = item
			count = 1
	return result
