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
	prev_list = gray_code(n-1) 
	num = pow(2, n-1) 
	res = [] 
	for i in range(len(prev_list)): 
		res.append(prev_list[i]) 
	for i in range(len(prev_list)-1, -1, -1): 
		res.append(num + prev_list[i]) 


