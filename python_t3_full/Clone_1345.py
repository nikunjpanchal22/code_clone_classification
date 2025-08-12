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
	current = None 
	count = 0 
	for element in iterable: 
		if element != current: 
			current = element 
			count = 0 
		count += 1 
		if count == n: 
			result.add(current) 
	return result


