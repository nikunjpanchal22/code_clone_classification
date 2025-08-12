def factorial(n) :
	base = 1
	for i in range(n, 0, - 1) :
		base = base * i
	print (base)


 def factorial(n):
    if n == 0:
        return 1
    r = 1
    for i in range(1, n + 1):
        r *= i
    return r


