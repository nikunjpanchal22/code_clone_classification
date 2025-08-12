def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


    return roman



def int_to_roman(number):
    numeral_map = zip(
        (1000,  900,  500,  400, 100, 90, 50,  40,  10,  9,   5,  4,   1),
        ('M',  'CM', 'D', 'CD','C', 'XC','L','XL','X','IX','V','IV','I')
    )
    result = []
    for integer, numeral in numeral_map:
        count = int(number / integer)


