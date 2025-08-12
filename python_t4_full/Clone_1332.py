def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print (n / x)
			return prime(n / x)


 def calculate_primes_from(n): 
   if n % 2 == 0 and n > 2: 
       print(int(n / 2))
       return calculate_primes_from(n // 2)

   for i in range(3, int(math.sqrt(n)) + 1, 2): 
       if n % i == 0: 
           print(int(n // i))
           return calculate_primes_from(n // i) 


