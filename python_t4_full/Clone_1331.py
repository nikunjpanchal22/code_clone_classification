def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print (n / x)
			return prime(n / x)


 def prime(num): 
   if num % 2 == 0 and num > 2: 
       print(int(num / 2))
       return prime(num // 2)

   for i in range(3, int(math.sqrt(num)) + 1, 2): 
       if num % i == 0: 
           print(int(num // i))
           return prime(num // i) 


