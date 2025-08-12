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


                print(number)
                number = int(number / 2) if number % 2 == 0 else ((3 * number) + 1)




def collatz(number):
        while number != 1:
                print(number)


