def int_to_roman(num) :
	_values = [
	1000000, 900000, 500000, 400000, 100000, 90000, 50000, 40000, 10000, 9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
	_strings = [
	'M', 'C', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
	result = ""
	decimal = num
	while decimal > 0 :
		for i in range(len(_values)) :
			if decimal > = _values [i] :
				if _values [i] > 1000 :
					result += u'\u0304'.join(list(_strings [i])) + u'\u0304'
				else :
					result += _strings [i]
				decimal -= _values [i]
				break
	return result




def int_to_roman(n):
    digits = [(1000000,  'M\u0304'), (900000, 'C\u0304M\u0304'), (500000,'D\u0304'), 
              (400000, 'C\u0304D\u0304'), (100000 , 'C\u0304'), (90000, 'X\u0304C\u0304'),
              (50000, 'L\u0304'), (40000, 'X\u0304L\u0304'), (10000, 'X\u0304'), (9000, 'I\u0304X\u0304'), 
              (5000, 'V\u0304'),  (4000, 'I\u0304V\u0304'),(1000, 'M'), (900, 'CM'),
              (500,'D'),   (400,'CD'),   (100,'C'),   (90 , 'XC'),  (50, 'L'),   
              (40, 'XL'),  (10, 'X'), (9, 'IX'), (5, 'V'),  (4, 'IV'), (1,   'I')]
    roman = []
    for value, letter in digits:
        count, n = divmod(n, value)
        roman.append(letter * count)
    return ''.join(roman)



