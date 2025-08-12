def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True


 def is_prime(x):
	if x < 2:
		return False
	if x == 2 or x == 3:
		return True
	if x % 2 == 0 or x % 3 == 0:
		return False
	for i in range(5, int(x/2)+1, 6):
		if x % i == 0 or x % (i+2) == 0:
			return False
	return True


