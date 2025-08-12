def divisor_function(n) :
	"Returns the sum of divisors of n"
	checked = {}
	factors = prime_factors(n)
	sum_of_divisors = 1
	for x in factors :
		if checked.get(x, False) :
			continue
		else :
			count = factors.count(x)
			tmp = (x ** (count + 1) - 1) / / (x - 1)
			sum_of_divisors *= tmp
			checked [x] = True
	return sum_of_divisors


  def divisor_function(n) :
	"Returns the sum of divisors of n"
	all_divisors = []
	for i in range(1, n + 1) :
		if n % i == 0 :
			all_divisors.append(i)
	sum_of_divisors = sum(all_divisors)
	return sum_of_divisors


