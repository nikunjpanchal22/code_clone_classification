def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


 def int_to_roman(number):
    result = ''
    while number > 0:
        i = 0
        while i < len(ROMAN) and ROMAN[i][0] <= number:
            i += 1
        arabic, roman = ROMAN[i-1]
        factor, number = divmod(number, arabic)
        result += roman * factor
    return result


