def fib(n) :
	if n == 1 :
		return (1)
	elif n == 0 :
		return (0)
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n):
    fib_seq = [0, 1] + [0] * (n-1)
    fib_seq = [fib_seq[i - 1] + fib_seq[i - 2] for i in range(2, n+1)]
    return fib_seq[n]




