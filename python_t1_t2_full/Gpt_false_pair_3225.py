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
	idx = 0
	idy = 0
	total = 0
	while idx < len(user_choice) :
		while idy < len(roman_numerals) and not user_choice.startswith(roman_numerals [indy] [0], idx) :
			idy += 1
		if idy < len(roman_numerals) :
			total += roman_numerals [idy] [1]
			idx += len(roman_numerals [idy] [0])
		else :
			raise ValueError('Invalid Roman numeral')
	return total

