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


            d += 1
    primes_set.add(int(n))
    return sorted(list(primes_set))



from itertools import chain, cycle
def primes(n):
    cycle_obj = chain([2, 1], cycle([2, 4]))
    f = next
    p = []
    for d in cycle_obj:
        while n % 2 == 0:
            p.append(2)
            n /= 2
        if n == 1: break
        while n % 3 == 0:
            p.append(3)
            n /= 3
        if n == 1: break
        while n % 5 == 0:
            p.append(5)
            n /= 5
        if n == 1: break


