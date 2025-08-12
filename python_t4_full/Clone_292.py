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
	factorlist = []
	while num > 1 : 
		divider = 2
		while divider <= num :
			if num % divider == 0 :
				factorlist.append(divider)
				num //= divider
				break
			divider += 1


