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





import collections    
def divisor_function(n):
    factors = prime_factors(n)
    factor_counts = collections.Counter(factors)
    sum_divisors = 1

    for factor in factor_counts.keys():
        sum = (factor ** (factor_counts[factor] + 1) - 1) / / (factor - 1)
        sum_divisors *= sum


