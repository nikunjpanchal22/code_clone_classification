def specialMultiplication(n) :
	to_process = []
	result = 1
	if n >= 2 :
		to_process.append(n)
		while to_process :
			n = to_process.pop()
			result *= n
			if n >= 3 :
				to_process.append(n - 1)
				if n >= 4 :
					to_process.append(n - 2)
	return result


 def specialMultiplication(n):
	result = 1
	if n >= 2:
		for i in reversed(range(2, n+1)):
			result *= i
	return result


