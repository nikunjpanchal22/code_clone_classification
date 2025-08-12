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



 def factorize(n) :
	i = n
	prime_numbers = [True] * n  
	prime_numbers[0] = prime_numbers[1] = False

	for i in range(n): 
		if (prime_numbers[i]): 
			for j in range(i * i, n, i): 
				prime_numbers[j] = False

			if n % i == 0 :
				yield i 


