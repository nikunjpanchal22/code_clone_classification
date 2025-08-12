def factorize(n) :
	divisors = itertools.count(2)
	divisor = divisors.next()
	while True :
		if divisor ** 2 > n :
			yield n
			break
		a, b = divmod(n, divisor)
		if b == 0 :
			yield divisor
			n = a
		else :
			divisor = divisors.next()


#gpt output=============
 def factorize(n) : 
	for i in range(2, int(math.sqrt(n))+1):  
		if n % i == 0: 
			yield i  
			n = n / i  


