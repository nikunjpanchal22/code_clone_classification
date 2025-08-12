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
    fac = []
    p = 2
    while p** 2 <= n: 
        while (n % p) == 0: 
            fac.append(p) 
            n //= p 
        p += 1
    if n > 1:
        fac.append(n)
    return fac 
