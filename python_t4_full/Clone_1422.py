def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True


 def is_prime(x) :
	if x <= 3:
		return x > 1
	elif x % 2 == 0 or x % 3 == 0:
		return False
	i = 5
	while i * i <= x:
		if x % i == 0 or x % (i + 2) == 0:
			return False
		i += 6
	return True


