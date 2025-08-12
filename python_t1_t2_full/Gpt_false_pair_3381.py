def prime_factors(n) :
	factors = []
	d = 2
	while (d * d < = n) :
		while (n > 1) :
			while n % d == 0 :
				factors.append(d)
				n = n / d
			d += 1
	return factors [- 1]




def prime_factors(n) :
	divisors = []
	d = 2
	while (d * d <= n) :
		while n > 1 :
			while n % d == 0 :
				divisors.append(d)
				n = n // d
			d += 1
	return divisors[-1]

