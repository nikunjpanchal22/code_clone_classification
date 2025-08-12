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


from collections import Counter
def divisor_function(n):
    factors = prime_factors(n)
    checked = Counter(factors)
    divisor_sum = 1
    for factor, count in checked.items():
        divisor_sum *= (factor ** (count + 1) - 1) / / (factor - 1)


