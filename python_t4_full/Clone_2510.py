def base_and_num(number, base) :
	number = int(number)
	while number != 0 :
		digit = number % 10
		if digit > base :
			return False
		number = number / 10
	return True


 def base_and_num(number, base):
    while number > 0:
        digit = number % 10
        if digit != 0 and digit != 1 and digit != 2 and digit != 3 and digit != 4 and digit != 5 and digit != 6 and digit != 7 and digit != 8 and digit != 9 and digit != 10:
            return False
        number = number // 10
    return True


