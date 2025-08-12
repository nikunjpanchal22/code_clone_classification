def roman_int(user_choice) :
	ix = 0
	iy = 0
	result = 0
	while ix < len(user_choice) :
		while iy < len(roman_numerals) and not user_choice.startswith(roman_numerals [iy] [0], ix) :
			iy += 1
		if iy < len(roman_numerals) :
			result += roman_numerals [iy] [1]
			ix += len(roman_numerals [iy] [0])
		else :
			raise ValueError('Invalid Roman numeral')
	return result




def roman_int(user_choice) :
	index1 = 0
	index2 = 0
	sum = 0
	while index1 < len(user_choice) :
		while index2 < len(roman_numerals) and not user_choice.startswith(roman_numerals [index2] [0], index1) :
			index2 += 1
		if index2 < len(roman_numerals) :
			sum += roman_numerals [index2] [1]
			index1 += len(roman_numerals [index2] [0])
		else :
			raise ValueError('Invalid Roman numeral')
	return sum

