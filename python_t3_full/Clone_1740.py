def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


 def int_to_roman(number):
    result = ""
    i = 0
    while number > 0 and i < len(ROMAN):
        arabic, roman = ROMAN[i]
        (factor, number) = divmod(number, arabic)
        result += roman * factor
        i += 1
    return result


