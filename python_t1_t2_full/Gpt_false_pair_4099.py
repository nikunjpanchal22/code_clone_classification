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




def is_prime(num) : 
	if num < 2 : 
		return False 
	if num % 2 == 0 :
		return num == 2 
	i = 3 
	while i * i <= num : 
		if num % i == 0 : 
			return False 
		i += 2 
	return True 

