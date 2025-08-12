def find_solution(low, high) :
	for num in xrange(low, high + 1) :
		lst = find_prime_factors(num)
		for n, count in lst :
			pf [n] = max(pf [n], count)
	print "prime factors:", pf
	solution = 1
	for n, count in pf.items() :
		solution *= n ** count
	return solution


    for prime in primes:
        product *= prime
    return product



import math

def find_solution(a,b):
    primes = [True for i in range(b+1)]
    p = 2
    while(p * p <= b):
        if (primes[p] == True):
            for i in range(p*p, b+1, p):
                primes[i] = False
        p += 1


