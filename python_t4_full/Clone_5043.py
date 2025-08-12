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



import math
def find_solution(a, b) :
    def prime_factors(n):
        i = 2
        factors = []
        while i * i <= n:
            if n % i:
                i += 1
            else:
                n //= i
                factors.append(i)
        if n > 1:
            factors.append(n)
        return factors

    solution = 1
    for num in range(a, b + 1) :
        pa = prime_factors(num)
        solution *= pa
    return solution




