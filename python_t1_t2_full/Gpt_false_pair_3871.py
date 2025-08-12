def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result




def int_to_roman(value) :
	string = ""
	for (arabic, roman) in ROMAN :
		(factor, value) = divmod(value, arabic)
		string += roman * factor
	return string
