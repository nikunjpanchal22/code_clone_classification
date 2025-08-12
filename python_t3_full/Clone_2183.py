def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True


    while f <= r:
        if x % f == 0:
            return False
        if x % (f + 2) == 0:
            return False
        f += 6
    return True  



def is_prime(x):
    if x < 2:
        return False
    elif x == 2 or x == 3:
        return True 


