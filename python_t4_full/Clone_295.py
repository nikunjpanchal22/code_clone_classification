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
		for i in range (2, num + 1) :
			if num % i == 0 : 
				factorlist.append(i)
				num = num//i
				break


