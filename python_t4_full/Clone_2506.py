def base_and_num(number, base) :
	number = int(number)
	while number != 0 :
		digit = number % 10
		if digit > base :
			return False
		number = number / 10
	return True


 def base_and_num(number, base):
	digit_list = [int(d) for d in str(number)]
	for digit in digit_list:
		if digit <= base:
			continue
		else:
			return False
	return True


