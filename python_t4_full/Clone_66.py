def collatz(number) :
	if number % 2 == 0 :
		print((number // 2))
		return number // 2
	elif number % 2 != 0 :
		result = 3 * number + 1
		print((result))
		return result


 def collatz(number): 
	result = number / 2 if number % 2 == 0 else 3 * number + 1
	print(result) 
	return result 


