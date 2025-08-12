def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True




def isPrime(val):
    if val < 2:
        return False
    for x in range(2, val - 1):
        if val % x == 0:
            return False
    return True
