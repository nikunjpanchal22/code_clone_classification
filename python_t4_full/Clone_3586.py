def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)


import os

def fib(n):
    global call_count
    call_count += 1
    return reduce(lambda x, n: [x[1], x[0] + x[1]], range(n), [0, 1])[0]






