def base_and_num(number, base) :
	number = int(number)
	while number != 0 :
		digit = number % 10
		if digit > base :
			return False
		number = number / 10
	return True


 def base_and_num(number, base):
    digits_list = []
    for digit in str(number):
        if digit == 0 or digit == 1 or digit == 2 or digit == 3 or digit == 4 or digit == 5 or digit == 6 or digit == 7 or digit == 8 or digit == 9:
            digits_list.append(int(digit))
    if base not in digits_list:
        return False
    return True


