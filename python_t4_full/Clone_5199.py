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





import math
def primes(n):
    primes = []
    for x in range(2, math.isqrt(n) + 1):
        if n % x:
            continue
        while n % x == 0:
            primes.append(x)
            n /= x
        if n == 1:
            break


