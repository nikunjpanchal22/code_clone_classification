def is_prime(x) :
	if x < 2 :
		return False
	elif x == 2 :
		return True
	for n in range(2, x) :
		if x % n == 0 :
			return False
	return True


 def is_prime(x):
    divisor=[]
    for i in range(2,x):
        if x % i == 0:
            divisor.append(i)
    if len(divisor) == 0 :
        return True
    else:
        return False


