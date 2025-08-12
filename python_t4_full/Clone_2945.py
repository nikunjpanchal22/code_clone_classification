def factorial(n) :
	base = 1
	for i in range(n, 0, - 1) :
		base = base * i
	print(base)


 def factorial(n):
		prev_n = 1
		cur_n = 1
		for i in range(2, n+1):
			cur_n *= i
			prev_n = cur_n
		print (prev_n)


