def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print n / x
			return prime(n / x)



from sympy import isprime
def prime(n):
    for x in range(2, n):
        if isprime(x) and n % x == 0:
            print(n / x)
            return prime(n / x)


