def fib(n) :
	if n == 0 :
		return 0
	elif n == 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)


  def fib(n):
    if n<0:
        return "Error number must be positive"
    elif n==0 or n==1:
        return n
    else:
        return fib(n-1)+fib(n-2)


