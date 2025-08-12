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
    factors = []
    divisor = 2
    while divisor*divisor <= n:  
        while n % divisor == 0:
            factors.append(divisor)
            n = n // divisor
        divisor = divisor + 1


