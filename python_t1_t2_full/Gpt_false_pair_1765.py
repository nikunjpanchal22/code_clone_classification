def primes(n) :
	primfac = []
	d = 2
	while d * d <= n :
		while (n % d) == 0 :
			primfac.append(d)
			n //= d
		d += 1
	if n > 1 :
		primfac.append(n)
	return primfac


 def primes(n):
    fact = []
    x = 2
    while x * x <= n :
        while (n % x) == 0:
            fact.append(x)
            n //= x 
        x += 1
    if n > 1:
        fact.append(n)
    return fact 
