def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print n / x
			return prime(n / x)


from math import sqrt
def prime(n):
    for divisor in [x for x in range(2, int(sqrt(n)) + 1) if not n % x]:
        print(n // divisor)
        return prime(n//divisor)

 


