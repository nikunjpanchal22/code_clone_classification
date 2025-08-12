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
    translations = {'I': 1, 'V': 5, 'X': 10,'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    number = 0
    for i in range(len(s)):
        if i + 1 < len(s) and translations[s[i]] < translations[s[i + 1]]:
            number -= translations[s[i]]
        else:
            number += translations[s[i]]
    return number




