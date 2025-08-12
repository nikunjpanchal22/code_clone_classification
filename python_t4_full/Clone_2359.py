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


 def divisor_function(n):
    "Returns the sum of divisors of n"
    if n == 1:
        return 1
    sum_of_divisors = 1
    for i in range(2, int(n**0.5)+1) :
        if n % i == 0:
            sum_of_divisors += (i + (n //i))
    return sum_of_divisors


