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
	previous = None
	pos = 0
	for item in iterable :
		if item == previous :
			pos += 1
			if pos == n :
				result.add(previous)
		else :
			previous = item
			pos = 1
	return result
