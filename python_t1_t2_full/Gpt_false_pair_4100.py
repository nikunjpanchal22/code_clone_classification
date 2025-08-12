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




def is_prime (number) :
	if number < 2 :
		return False 
	if number % 2 == 0 :
	    return number == 2 
	x = 3 
	while x * x <= number :
		if number % x == 0 :
			return False 
		x += 2 
	return True
