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
    div_sum = 0
    divisors = [i for i in xrange(1,n+1) if n % i == 0]
    for x in divisors :
        div_sum += x
    return div_sum


