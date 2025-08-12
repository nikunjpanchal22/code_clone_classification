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
    primary = []
    index = 2
    while index*index<= n :
        while (n % index) == 0 :
            primary.append(index)
            n //= index
        index += 1
    if n > 1 :
        primary.append(n)
    return primary
