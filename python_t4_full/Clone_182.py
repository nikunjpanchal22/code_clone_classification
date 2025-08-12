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


            raise ValueError('Invalid Roman numeral')
    return result



def roman_numeral(user_choice):
    index = 0
    result = 0
    while index < len(user_choice):
        if any(user_choice.startswith(roman[0], index) for roman in roman_numerals):
            roman = next(roman for roman in roman_numerals if user_choice.startswith(roman[0], index))
            result += roman[1]


