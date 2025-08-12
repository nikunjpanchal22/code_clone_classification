def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n):
    a, b = 0, 1
    for _ in range(1, n+1):
        a, b = b, a + b
    return b



