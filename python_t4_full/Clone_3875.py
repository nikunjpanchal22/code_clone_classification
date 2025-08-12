def getPrimes(n) :
	i = 2
	while i < n :
		prime = True
		for a in xrange(2, i) :
			if i % a == 0 :
				prime = False
				break
		if prime :
			yield i
		i += 1


    return data




def getPrimes(n):
    if n < 2: return []
    sieve = [True] * n
    for x in range(2, int(n ** 0.5) + 1):
        p = 2 * x
        while p < n:
            sieve[p] = False


