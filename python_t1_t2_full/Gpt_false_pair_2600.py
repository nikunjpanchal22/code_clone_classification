def factors(num) :
	numroot = int(math.sqrt(num)) + 1
	for i in xrange(2, numroot) :
		divider, remainder = divmod(num, i)
		if not remainder :
			yield i
			break
	else :
		yield num
		return
	for factor in factors(divider) :
		yield factor




def factors(n) :
	numroot = int(math.sqrt(n)) + 1
	for i in range(2, numroot) :
		quo, rem = divmod(n, i)
		if not rem :
			yield i
			break
	else :
		yield n
		return
	for factor in factors(quo) :
		yield factor
