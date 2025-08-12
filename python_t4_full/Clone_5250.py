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


        if n % i:
            i += 1
        else:
            n //= i
    return n




def prime_factors(n):
    i = 2
    factor = None
    while i * i <= n:
        if n % i:
            i += 1


