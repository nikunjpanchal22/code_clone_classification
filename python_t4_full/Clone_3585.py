def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n): 
	a, b = 1, 1
	for _ in range(n): a, b = b, a + b
	return a
	  


