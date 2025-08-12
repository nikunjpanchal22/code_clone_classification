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
    result = gray_code(n - 1) 
    num = 1 << (n - 1) 
    for i in reversed(result): 
        result.append(i+num) 


