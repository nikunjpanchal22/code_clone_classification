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
    numerals = {"I": 1, "IV": -2, "V": 5, "IX": -2, "X": 10, "XL": -20, "L": 50, 
              "XC": -20, "C": 100, "CD": -200, "D": 500, "CM": -200, "M": 1000}
    return sum(numerals.get(s[max(i-1, 0):i+1], numerals[n]) for i, n in enumerate(s))




