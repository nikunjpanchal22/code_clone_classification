def fib(n) :
	if n == 1 :
		return (1)
	elif n == 0 :
		return (0)
	else :
		return fib(n - 1) + fib(n - 2)


import math
def fib(n):
    phi = (1 + math.sqrt(5)) / 2
    return round(phi ** n / math.sqrt(5))




