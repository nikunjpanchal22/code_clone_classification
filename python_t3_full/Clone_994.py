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
  if n == 2:
    return True
  st = 3
  while(st * st <= n):
    if n % st == 0:
      return False
    st += 2
  return True


