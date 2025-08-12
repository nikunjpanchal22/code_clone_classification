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


 def consec(n, seq):
	result = set()
	run_length = 0
	prev = -99
	
	for elem in seq:
		if elem != prev:
			run_length = 0
		else:
			run_length += 1
			if run_length == n:
				result.add(elem)
		prev = elem
	return result


