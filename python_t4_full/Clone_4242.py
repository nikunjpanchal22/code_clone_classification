def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True





def is_prime(x):
    return (x > 1 and all(x % i for i in range(2, int(x**0.5) + 1)))



def is_prime(x):
    if x < 2:
        return False


