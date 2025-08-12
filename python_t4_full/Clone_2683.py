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
	if n <= 1:
		return 1
	total = n
	for i in range(1, n-1):
		total *= (i+1)
	return total


