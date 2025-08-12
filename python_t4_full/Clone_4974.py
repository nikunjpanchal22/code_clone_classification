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





from functools import reduce

def divisor_function(n):
    factors = prime_factors(n)
    divisor_sum = 1
    for factor in set(factors):
        divisor_sum *= (factor ** (factors.count(factor) + 1) - 1 ) / / (factor - 1)
    return divisor_sum


