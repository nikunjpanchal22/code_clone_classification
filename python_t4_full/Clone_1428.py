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
    if n ==2 or n == 3:
        return True
    if n % 2 != 0 and n % 3 != 0:
        for i in range(2,int(n**0.5)+2):
            if n % i == 0:
                return False
        else:
            return True
    else:
        return False


