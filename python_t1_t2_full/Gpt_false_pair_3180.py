def primes(n) :
	primfac = []
	d = 2
	while d * d < = n :
		while (n % d) == 0 :
			primfac.append(d)
			n //= d
		d += 1
	if n > 1 :
		primfac.append(n)
	return primfac




def primes(n):
	primfac = []
	d = 3
	while d * d <= n:
		if (n % d) == 0:
			primfac.append(d)
			n //= d
		d += 2
	if n > 1 :
		primfac.append(n)
	return primfac

