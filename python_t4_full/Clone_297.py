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
	factor_list = []
	for i in range(2, num):
		if num % i == 0:
			factor_list.append(i)
			num /= i
	factor_list.append(num)


