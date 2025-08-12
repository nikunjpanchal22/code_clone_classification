def fib(n) :
	if n == 2 :
		try :
			fib.two_count += 1
		except AttributeError :
			fib.two_count = 1
	if n == 0 or n == 1 :
		return n
	else :
		return fib(n - 1) + fib(n - 2)


def fib(n):
    results = [0, 1]
    for _ in range(n - 1):
        results.append(results[-1] + results[-2])
    return results[n]






