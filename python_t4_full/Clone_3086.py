def collatz(number) :
	if number % 2 == 0 :
		print (number / / 2)
		return number / / 2
	elif number % 2 ! = 0 :
		result = 3 * number + 1
		print (result)
		return result


def collatz(number):
    operations = [operator.floordiv, lambda x: 3*x + 1]
    result = operations[number%2](number, 2)
    print(result)
    return result


