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



def factors(num):
    fact = [i for i in range(1, num//2+1) if num % i == 0]
    fact.append(num)
    return fact



def factors(n):
    results = set()


