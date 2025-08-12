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
	factors = []
	for i in range(2, int(n**0.5)+1):
		if not n % i:
			factors.append(i)
			n //= i
			while not n % i:
				factors.append(i)
				n //= i
	if n > 1:
		factors.append(n)
	return factors


