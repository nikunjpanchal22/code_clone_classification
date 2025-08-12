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


        return [x for x in range(1,n+1) if n%x==0]
    return [i for i in divisors(n) if len(divisors(i))==2]



from math import sqrt
def primes(n):
    primes_set = set()
    d = 2
    limit = sqrt(n)
    while d <= limit:
        if n % d == 0:
            primes_set.add(d)
            n /= d
            limit = sqrt(n)


