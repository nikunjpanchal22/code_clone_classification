def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


 def int_to_roman(number):
    result = ''
    max_roman_num = max(ROMAN, key=lambda item: item[0])[0]
    for arabic, roman in ROMAN:
        times, number = divmod(number, arabic)
        if number >= max_roman_num:
            number -= max_roman_num
            times += 1
        result += roman * times
    return result


