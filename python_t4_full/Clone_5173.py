def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


    while number > 0:
        for i, numer in num_map:
            while number >= i:
                roman += numer
                number -= i
    return roman



def int_to_roman(num):
    if num > 0 and num < 4000:
        numeral_order = {1000:('M', 1000), 900:('CM', 900), 500:('D', 500), 400:('CD', 400), 100:('C', 100), 90:('XC', 90), 50:('L', 50), 40:('XL', 40), 10:('X', 10), 9:('IX', 9), 5:('V', 5), 4:('IV', 4), 1:('I', 1)}
        keys = sorted(numeral_order.keys(), reverse = True)


