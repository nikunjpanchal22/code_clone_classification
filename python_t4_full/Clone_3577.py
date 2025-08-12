def fib(n) :
	if n == 1 :
		return (1)
	elif n == 0 :
		return (0)
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n):
    def fibo(n):
        if n == 0: return 0
        elif n == 1: return 1
        else: return fibo(n-1) + fibo(n-2)


