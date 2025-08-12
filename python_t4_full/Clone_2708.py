def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


 def int_to_roman(number):
    result = ''
    for arabic, roman in ROMAN:
        times, number = divmod(number, arabic)
        result += roman * times
        if number < arabic:
            break
    return result


