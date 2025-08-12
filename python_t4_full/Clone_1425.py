def is_prime(n) :
	if n < 2 :
		return False;
	if n % 2 == 0 :
		return n == 2
	k = 3
	while k * k < = n :
		if n % k == 0 :
			return False
		k += 2
	return True


 def is_prime(n):
   if n <= 1: 
       return False
   if n <= 3: 
       return True

   if n % 2 == 0 or n % 3 == 0:
       return False

   i = 5;
   while i * i <= n:
       if n % i == 0 or n % (i + 2) == 0: 
           return False
       i += 6
   return True


