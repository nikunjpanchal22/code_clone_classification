def gray_code(n) :
  if n == 0: 
    return [0] 
  elif n == 1: 
    return [0, 1] 



 def gray_code(n) : 
    if n == 0: 
        return [0] 
    elif n == 1: 
        return [0, 1] 
    arr = gray_code(n - 1) 
  
    num = 1 << (n - 1) 
  
    for i in range(len(arr)-1, -1, -1): 
        arr.append(arr[i] + num) 
  


