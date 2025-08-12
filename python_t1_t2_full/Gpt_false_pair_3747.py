def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print n / x
			return prime(n / x)




def prime(n) :
	for x in range(2, int(n**0.5) + 1) :
		if n % x == 0 :
			print n / x
			return prime(n / x)

