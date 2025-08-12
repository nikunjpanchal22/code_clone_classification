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


#gpt output=============
  def prime_factors(n):
    factors = []
    d = 2
    while (n > 1):
        if (n % d == 0):
            factors.append(d)
            n = n // d
            d = 1
        d += 1


