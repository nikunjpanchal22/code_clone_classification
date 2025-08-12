def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result


        number -= integer * count
    return ''.join(result)



def int_to_roman(input):
    if isinstance(input, type(1)):
        ints = (1000, 900,  500, 400, 100,  90, 50,  40, 10,  9,   5,  4,   1)
        nums = ('M',  'CM', 'D', 'CD','C', 'XC','L','XL','X','IX','V','IV','I')
        result = ""
        for i in range(len(ints)):
            count = int(input / ints[i])
            result += nums[i] * count


