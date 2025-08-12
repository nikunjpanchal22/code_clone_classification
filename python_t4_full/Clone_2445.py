def fib(n) :
	if n <= 2 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)



 def fib(n):
  if n <= 2:
    return 1
  a,b=1,1
  while n-2 > 0:
    a,b=b,a+b
    n-=1


