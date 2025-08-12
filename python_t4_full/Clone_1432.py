def is_prime(x) :
	if x < 2 :
		return False
	elif x == 2 :
		return True
	for n in range(2, x) :
		if x % n == 0 :
			return False
	return True


 def is_prime(n): 
      
    if n <= 1: 
        return False
  
    if n <= 3: 
        return True
  
    if n % 2 == 0 or n % 3 == 0: 
        return False
  
    i = 5
    while i*i <= n: 
        if n % i == 0 or n % (i + 2) == 0: 
            return False
        i = i + 6
  
    return True


