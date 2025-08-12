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
    add = 1 << (n-1)
    post = [x + add for x in reversed(pre)]


