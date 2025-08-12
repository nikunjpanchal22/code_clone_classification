def gray_code(n) :
  if n == 0: 
    return [0] 
  elif n == 1: 
    return [0, 1] 



 def gray_code(n): 
	if n == 0: 
		return [0] 
	elif n == 1: 
		return [0, 1] 
	pre = gray_code(n-1) 
	post = [x+(2**(n-1)) for x in reversed(pre)] 
				


