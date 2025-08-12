def prime(n) :
	for x in range(2, int(math.sqrt(n)) + 1) :
		if n % x == 0 :
			print (n / x)
			return prime(n / x)


 def prime_number(num): 
   if num == 1: 
       return
 
   start_number = 2 
   while start_number * start_number <= num and num > 1: 
       if num % start_number == 0: 
           print(int(num / start_number))
           return prime_number(int(num / start_number))
       start_number += 1


