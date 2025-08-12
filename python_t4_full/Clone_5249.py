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




def prime_factors(n):
    d = 2
    while d * d <= n:
        if (n % d):
            d += 1
        else:
            n //= d
            return d
    if n > 1:
        return n



