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
	if x == 2 or x == 3 or x % 2 != 0 and x % 3 != 0:
		return True
	if x % 2 == 0 or x % 3 == 0:
		return False
	for n in range(5, int(x ** 0.5) + 1, 6):
		if x % n == 0 or x % (n+2) == 0:
			return False
	return True


