def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


 def int_to_roman(number):
    result = ''
    while number > 0:
        arabic, roman = next((arabic, roman) for arabic, roman in ROMAN if number >= arabic)
        factor, number = divmod(number, arabic)
        result += roman * factor
    return result


