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




def getPrimes(n):
    primes = []
    for possiblePrime in range(2, n):

        isPrime = True
        for num in range(2, possiblePrime):
            if possiblePrime % num == 0:
                isPrime = False

        if isPrime:
            primes.append(possiblePrime)
    return primes



