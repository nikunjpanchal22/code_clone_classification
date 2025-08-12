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


 def factoring(n):
    result = []
    factor = 2
    while factor*factor <= n:
        while (n % factor)==0:
            result.append(factor)
            n //= factor
        factor += 1
    if n > 1:
        result.append(n)
    return result
