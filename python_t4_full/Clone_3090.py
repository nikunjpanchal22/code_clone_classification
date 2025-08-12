def collatz(number) :
	if number % 2 == 0 :
		result = number / / 2
	elif number % 2 == 1 :
		result = 3 * number + 1
	while result == 1 :
		print (result)
		sys.exit()
	while result ! = 1 :
		print (result)
		number = result
		return collatz(number)



def collatz(n):
	while n != 1:
		print(n)
		n = n / 2 if (n % 2 == 0) else (n * 3 + 1)



