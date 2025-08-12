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
	for n in range(2, int(x/2)+1):
		if x % n == 0:
			return False
	return True
