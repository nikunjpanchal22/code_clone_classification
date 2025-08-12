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


 def is_prime(n) :
    prime = True
    if n < 2 :
        prime = False
    elif n == 2:
        prime = True
    else:
        for x in range(2, int(math.sqrt(n))+1):
            if n % x == 0:
                prime = False
    return prime


