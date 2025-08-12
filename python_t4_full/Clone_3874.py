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


    return [x for x in range(2, n) if sieve[x]]




from math import sqrt
def getPrimes(n):
    primes=[]
    for possiblePrime in range(2, n):

        isPrime = True
        for num in range(2, int(sqrt(possiblePrime) + 1)):
            if possiblePrime % num == 0:
                isPrime = False


