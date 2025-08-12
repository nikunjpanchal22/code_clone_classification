def is_prime(x) :
	if x < 2 :
		return False
	elif x == 2 :
		return True
	for n in range(2, x) :
		if x % n == 0 :
			return False
	return True


 def is_prime(number):
    if number < 2:
        return False
    limit = number ** 0.5
    i = 2
    while i <= limit:
        if number % i == 0:
            return False
        i += 1
    return True


