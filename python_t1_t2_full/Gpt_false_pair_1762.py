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


 def factorials(n):
	prime = []
	m = 2
	while m * m <= n :
		while (n % m) == 0 :
			prime.append(m)
			n //= m
		m += 1
	if n > 1 :
		prime.append(n)
	return prime
