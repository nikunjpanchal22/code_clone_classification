def factorial(n) :
	result = 1
	i = n * (n - 1)
	while n >= 1 :
		result = result * n
		n = n - 1
	return result


 def factorial(n): 
	res = 1
	for i in range(2,n+1):
		res = res * i
	return res


