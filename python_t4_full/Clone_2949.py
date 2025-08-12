def factorial(n) :
	base = 1
	for i in range(n, 0, - 1) :
		base = base * i
	print(base)


 def factorial(n):
		if n == 1:
			return n
		else:
			return n*factorial(n-1)
		print(factorial(n)) 


