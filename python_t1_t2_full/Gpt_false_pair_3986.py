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




def int_to_roman_4(num) :
	_v = [1000000, 900000, 500000, 400000, 100000, 90000, 50000, 40000, 10000, 9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
	_s = ['M', 'C', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
	resp = ""
	remaining = num
	while remaining > 0 :
		for i in range(len(_v)) :
			if remaining >= _v[i] :
				if _v[i] > 1000 :
					resp += u"\u0304".join(list(_s[i])) + u"\u0304"
				else :
					resp += _s[i]
				remaining -= _v[i]
				break
	return resp
