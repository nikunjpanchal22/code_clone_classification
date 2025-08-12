def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


 def int_to_roman(number):
    result = ""
    for arabic, roman in reversed(ROMAN):
        factor = number//arabic
        result += roman*factor
        number %= arabic
    return result


