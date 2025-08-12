def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print (n / x)
			return prime(n / x)


 def prime(n): 
   if n == 1: 
       return 

   i = 2 
   while i * i <= n and n > 1: 
       if n % i == 0: 
           print(int(n / i))
           return prime(int(n / i))
       i += 1


