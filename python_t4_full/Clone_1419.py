def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True


 def is_prime(x):
    if x > 3:
        for n in range(2, x):
            if x % n == 0:
                return False
    elif x == 1 or x == 0 or x == 2 or x == 3:
        return True
    return True


