def fib(n) :
	if n == 0 :
		return 0
	elif n == 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)


  def fib(n):
 
    if n < 0:
        raise ValueError("Number must be positive")
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n-1) + fib(n-2)
 
