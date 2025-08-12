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




def factors(num) :
	numroot = int(math.ceil(math.sqrt(num)))
	for i in xrange(2, numroot) :
		divider, remainder = divmod(num, i)
		if not remainder :
			yield i
			num //= i 
			break
	else :
		yield num
		return 
	for factor in factors(divider) :
		yield factor
	
