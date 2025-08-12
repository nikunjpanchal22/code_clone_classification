def fib(n) :
	if n == 1 :
		return (1)
	elif n == 0 :
		return (0)
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n):
    a, b = 0, 1
    for _ in range(n):
        temp = a
        a = b
        b = temp + b
    return a




