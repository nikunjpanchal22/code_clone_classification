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
  if (n%2 == 0 and n != 2) or n < 2:
    return False
  divisor = 3 
  while divisor <= int(sqrt(n)) + 1:
    if n%divisor == 0:
        return False
    divisor += 2
  return True


