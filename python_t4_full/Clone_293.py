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


#gpt output=============
 def factors(num) : 
 	factorlist = []
	i = 2
	while i * i <= num : 
		if num % i == 0 : 
			factorlist.append(i)
			num //= i
		else : 
			i += 1
	factorlist.append(num)


