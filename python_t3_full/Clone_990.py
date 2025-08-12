def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True


 def is_prime(x) :
	if x < 2 :
		return False
	if x == 2 or x == 3 or x==5 or x==7 :
		return True		
	if x % 2 == 0 or x %3 == 0 or x %5 == 0 or x %7 == 0 :
		return False	
	for n in range(11, x*x, 2):
		if n % x == 0:
			return False	
	return True


