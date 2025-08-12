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




from sympy import isprime

def find_solution(low, high):
    result = 1
    for num in range(low, high + 1):
        if isprime(num):
            result *= num


