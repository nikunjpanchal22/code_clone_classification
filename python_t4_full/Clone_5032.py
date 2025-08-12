def fib(n) :
	if n < = 2 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)


def fib(n): 
    a, b = 0, 1
    while n > 0:
        a, b = b, a + b
        n -= 1
    return a





