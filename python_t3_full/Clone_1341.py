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


 def consec(n, iterable):
	result = set()
	counter = 0
	for x in iterable:
		if counter == 0:
			temp = x
			counter += 1
		elif x == temp:
			counter += 1
		else:
			temp = x
			counter = 1
		if counter == n:
			result.add(temp)
	return result


