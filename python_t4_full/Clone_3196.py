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



def roman_int(s):
    rom_value = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    result, index = 0, len(s) - 1
    while index >= 0:
        if index < len(s) - 1 and rom_value[s[index]] < rom_value[s[index + 1]]:
            result -= rom_value[s[index]]
        else:
            result += rom_value[s[index]]
        index -= 1
    return result




