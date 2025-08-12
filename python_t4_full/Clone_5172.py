def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


        count = int(num / i)
        roman += numeral * count
        num -= i * count
    return roman



def int_to_roman(num):
    val = [1000, 900, 500, 400,100, 90, 50, 40,10, 9, 5, 4,1]
    rom = ['M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I']
    res,i = '',0


