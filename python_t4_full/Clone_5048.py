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


from functools import reduce
from sympy import primefactors

def find_solution(low, high) :
    product = reduce(lambda x, y: x*y, [max(primefactors(i)) 
             for i in range(low, high+1)])
    return product


