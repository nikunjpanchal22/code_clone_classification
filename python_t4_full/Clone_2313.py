def factors(n) :
	f = 2
	increments = itertools.chain([1, 2, 2], itertools.cycle([4, 2, 4, 2, 4, 6, 2, 6]))
	for incr in increments :
		if f * f > n :
			break
		while n % f == 0 :
			yield f
			n //= f
		f += incr
	if n > 1 :
		yield n


 def factors(n) :
	if not isinstance(n, int) or n < 0:
		raise ValueError('factors() arg not an int > 0')
	f, factors = 2, []
	for inc in itertools.chain([1, 2, 2], itertools.cycle([4,2,4,2,4,6,2,6])):
		if f * f > n :
			break
		while n % f == 0:
			factors.append(f)
			n //= f
		f += inc
	if n > 1 :
		factors.append(n)
	return factors


