def int_to_roman(number) :
	result = ""
	for (arabic, roman) in ROMAN :
		(factor, number) = divmod(number, arabic)
		result += roman * factor
	return result





def int_to_roman(n):
    nums = [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000]
    syms = ["I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"]
    roman = ''
    i = 12
    while n:
        div = n // nums[i]
        n %= nums[i]
        while div:
            roman += syms[i]
            div -= 1


