def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)




def fib_3(n) :
	call_count = call_count + 1
	if n <= 1 :
		return 1
	else :
		return fib_3(n - 1) + fib_3(n - 2)
