def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result




def int_to_roman(number) :
	output = ""
	for (arabic, roman) in ROMAN :
		(multiple, number) = divmod(number, arabic)
		output += roman * multiple
	return output

