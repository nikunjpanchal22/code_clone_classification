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




def find_solution(start, end) :
	pf = {}
	for num in range(start, end + 1) :
		lst = find_prime_factors(num)
		for x, y in lst :
			pf [x] = max(pf [x], y)
	print("prime factors: "+ str(pf))
	solution = 1
	for num, count in pf.items() :
		solution *= num ** count
	return solution
