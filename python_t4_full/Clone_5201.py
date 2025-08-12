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
    factors = [p for p in range(2,int(n**0.5)+1) if n%p==0]
    small_primes = [p for p in factors if all(p%sp for sp in factors if p != sp)]


