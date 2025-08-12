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
	x = 0
	y = 0
	val = 0
	while x < len(user_choice) :
		while y < len(roman_numerals) and not user_choice.startswith(roman_numerals [y] [0], x) :
			y += 1
		if y < len(roman_numerals) :
			val += roman_numerals [y] [1]
			x += len(roman_numerals [y] [0])
		else :
			raise ValueError('Invalid Roman numeral')
	return val
