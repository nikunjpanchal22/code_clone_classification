def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


 def int_to_roman(number):
    result = ""
    while number > 0:
        (arabic, roman) = next((i, j) for i, j in ROMAN if number >= i)
        factor = number // arabic
        result += roman * factor
        number %= arabic
    return result


