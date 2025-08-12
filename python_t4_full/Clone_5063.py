def base_and_num(number, base) :
	number = int(number)
	while number ! = 0 :
		digit = number % 10
		if digit > base :
			return False
		number = number / 10
	return True


def base_and_num(number, base):
	number = list(str(number))
	digits_greater_than_base = filter(lambda digit: int(digit) > base, number)
	return len(list(digits_greater_than_base)) == 0


 


