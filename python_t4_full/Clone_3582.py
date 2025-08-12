def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n, computed = {0: 0, 1: 1}):
	global call_count
	call_count += 1
	if n not in computed:
		computed[n] = fib(n-1, computed) + fib(n-2, computed)
	return computed[n]



