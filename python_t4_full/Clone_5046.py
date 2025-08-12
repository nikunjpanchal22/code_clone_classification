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


    for p in range(a,b+1):
        if prime[p]:
            product*=p
    return product



import itertools
import numpy as NP

def find_solution(low, high):
    max_k = high.bit_length()
    primes = NP.array([2] + [ob for ob in
                             itertools.islice(itertools.count(3, 2), (max_k - 2) // 2)
                             if NP.all(ob % NP.arange(2, int((ob ** 0.5) + 1), 2) != 0)])


