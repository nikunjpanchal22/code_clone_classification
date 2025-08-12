def fib(n) :
	if n <= 2 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)



 def fib(n):
  a,b = 0,1
  if n == 0: 
    return 0
  elif n == 1:
    return 1
  else:
    for i in range(2,n):
      c = a+b
      a = b
      b = c


