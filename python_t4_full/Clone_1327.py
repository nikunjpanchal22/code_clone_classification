def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print (n / x)
			return prime(n / x)


 def prime(n): 
   if n == 1: 
       return 
   found_divisor = False
   while not found_divisor and n > 1: 
       for x in range(2, int(math.sqrt(n)) + 1): 
           if n % x == 0: 
               print(n / x)
               found_divisor = True
               n = n // x
   if found_divisor:
       return prime(n)


