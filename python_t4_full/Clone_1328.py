def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print (n / x)
			return prime(n / x)


 def prime(n): 
   if n == 1: 
       return 

   divisor = 2 
   while divisor * divisor <= n and n > 1: 
       if n % divisor == 0: 
           print(int(n // divisor))
           return prime(n // divisor)
       divisor += 1


