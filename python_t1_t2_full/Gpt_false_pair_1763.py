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
    primfac = [] 
    i = 2
    while i * i <= n: 
        while (n % i) == 0: 
            primfac.append(i) 
            n //= i 
        i += 1
    if n > 1: 
        primfac.append(n)
    return primfac 
