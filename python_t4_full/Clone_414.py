def gray_code(n) :
  if n == 0: 
    return [0] 
  elif n == 1: 
    return [0, 1] 



 def gray_code(n):
 	if n <= 1:
 		return [i for i in range(1<<n)]
 	pre = gray_code(n-1)
 	post = [x | (1<<(n-1)) for x in pre[::-1]]


