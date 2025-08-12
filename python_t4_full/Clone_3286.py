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



def factors(n):
    return set(reduce(list.__add__, 
                ([i, n//i] for i in range(1, int(n**0.5) + 1) if n % i == 0)))



