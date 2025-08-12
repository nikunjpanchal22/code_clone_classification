def gray_code(n) :
  if n == 0: 
    return [0] 
  elif n == 1: 
    return [0, 1] 



 def gray_code(n):
	if n==0:
		return [0]
	elif n == 1:
		return [0, 1]
	prev_list = gray_code(n-1)
	num = 2**(n-1)
	res =[]
	res.extend(prev_list)
	for i in range(-1, -len(prev_list)-1,-1):
		res.append(prev_list[i] + num)


