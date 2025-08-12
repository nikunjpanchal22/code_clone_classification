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
	i1 = 0
	i2 = 0
	res = 0
	while i1 < len(user_choice) :
		while i2 < len(roman_numerals) and not user_choice.startswith(roman_numerals [i2] [0], i1) :
			i2 += 1
		if i2 < len(roman_numerals) :
			res += roman_numerals [i2] [1]
			i1 += len(roman_numerals [i2] [0])
		else :
			raise ValueError('Invalid Roman numeral')
	return res

