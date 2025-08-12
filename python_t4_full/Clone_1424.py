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
   elif n == 2:
     return True
   elif n % 2 == 0:
     return False
   else:
    d = 3
    while (d * d) <= n:
      if n % d == 0:
        return False      
      d += 2
    return True



