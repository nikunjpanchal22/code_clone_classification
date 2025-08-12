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
    curr = gray_code(n-1) 
    num = 1 << (n-1); 
    res = [] 
    for i in range(len(curr)): 
        res.append(num & curr[i]) 
        res.append(num | curr[i]) 


