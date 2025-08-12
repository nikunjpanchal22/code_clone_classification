def factorial(n) :
	num = 1
	while n > = 1 :
		num = num * n
		n = n - 1
	return num



 

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)


