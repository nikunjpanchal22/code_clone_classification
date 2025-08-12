def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)


  def fib(n): 
    global call_count
    call_count = call_count + 1
    if n <= 1: 
        return 1
    else: 
        return fib(n-1) + pow(fib(n-2),2) 
