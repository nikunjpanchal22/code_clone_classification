def is_prime(x) :
	if x < 2 :
		return False
	for n in range(2, (x) - 1) :
		if x % n == 0 :
			return False
	return True


 def is_prime(x):
   if (x==1):
        return False
   elif (x==2):
        return True;
   else:
      for n in range(2,x):
            if(x % n==0):
                return False
      return True            


