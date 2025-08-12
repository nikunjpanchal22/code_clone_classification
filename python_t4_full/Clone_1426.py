def is_prime(n) :
	if n < 2 :
		return False;
	if n % 2 == 0 :
		return n == 2
	k = 3
	while k * k < = n :
		if n % k == 0 :
			return False
		k += 2
	return True


 def is_prime(n):
    if n < 2:
        return False
    if n == 2 or n == 3:
        return True
    if n%2 == 0:
        return False
    max_div = int(sqrt(n)) + 1
    for i in range(3, max_div, 2):
        if n%i == 0:
            return False
    return True


