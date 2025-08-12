def fib(n) :
	global call_count
	call_count = call_count + 1
	if n < = 1 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)



def fib(n): 
	dp = [0, 1] + [0]*(n-1)
	for i in range(2, n+2): 
		dp[i] = dp[i-1] + dp[i-2] 
	return dp[n+1]
	  


