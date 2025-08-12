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
	if n <= 1 or (n % 2 == 0 and n > 2): 
		return False
	return all(n % i for i in range(3, int(n**.5) + 1, 2))



def is_prime(n):
	if n in (2, 3):
		return True
	if n < 2 or n % 2 == 0: 
		return False
	if n < 9:
		return True
	if n % 3 == 0:
		return False
	r = int(n**0.5)


