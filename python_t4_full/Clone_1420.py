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
	start = 5
	while start <= (x ** 0.5):
		if x % start == 0 or x % (start + 2) == 0:
			return False
		start += 6
	return True


