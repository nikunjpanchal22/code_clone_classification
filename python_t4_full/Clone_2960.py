def factorial(n) :
	result = 1
	i = n * (n - 1)
	while n >= 1 :
		result = result * n
		n = n - 1
	return result


 def factorial(n):
	if n == 0:
		return 1
	if n == 1:
		return 1
	return n*factorial(n-1)


