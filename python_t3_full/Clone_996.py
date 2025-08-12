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
    if n>2 and n%2 == 0:
        return False
    check = 3
    while check**2 <= n:
        if n%check == 0:
            return False
        check+=2
    return True


