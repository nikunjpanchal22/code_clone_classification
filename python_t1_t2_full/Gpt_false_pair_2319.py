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




def find_solution(start_num, end_num) :
	prime_factors = {}
	for num in xrange(start_num, end_num + 1) :
		lst = find_prime_factors(num)
		for n, count in lst :
			prime_factors [n] = max(prime_factors[n], count)
	print "Prime Factors:", prime_factors
	answer = 1
	for n, count in prime_factors.items() :
		answer *= n ** count
	return answer
