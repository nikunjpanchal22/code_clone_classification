def gray_code(n) :
  if n == 0: 
    return [0] 
  elif n == 1: 
    return [0, 1] 



 def gray_code(n): 
	if n==0: 
		return [0] 
	elif n==1: 
		return [0, 1] 
	result = gray_code(n-1)
	num = pow(2, n-1) 
	res = [] 
	for i in range(len(result)): 
		res.append(num | result[i]) 
		res.append(result[i]) 


