def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True


 def is_prime(x):
    if x <= 1:
        return False
    if x == 2:
        return True

    # check for all other numbers
    for i in range(2, x):
        if x % i == 0:
            return False
    return True


