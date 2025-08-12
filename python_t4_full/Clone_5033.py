def fib(n) :
	if n < = 2 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)





def fib(n):
    fib_values = [0, 1] + [0] * (n - 1)
    for i in range(2, n + 1):
        fib_values[i] = fib_values[i - 1] + fib_values[i - 2]
    return fib_values[n]


