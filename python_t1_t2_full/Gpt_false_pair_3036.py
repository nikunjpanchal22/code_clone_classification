def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)




def fib_4(n) :
	global call_count
	call_count += 1
	if n <= 1 :
		return 1
	else :
		return fib_4(n - 1) + fib_4(n - 2)
