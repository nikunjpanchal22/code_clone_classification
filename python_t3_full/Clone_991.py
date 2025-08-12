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
    elif x == 2 or x == 3 or x == 5 or x == 7 or x == 11 or x == 13 or x == 17 or x == 19 or x == 23 or x== 29 or x == 31 or x == 37 or x == 41 or x == 43 or x == 47 or x == 53 or x == 59 or x == 61 or x == 67 or x == 71 or x == 73 or x == 79 or x == 83 or x == 89 or x == 97:
        return True
    else:
        for n in range(2, int(x ** 0.5) + 1):
            if x % n ==0:
                return False
    return True


