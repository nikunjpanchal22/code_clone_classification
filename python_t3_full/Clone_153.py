def roman_int(user_choice) :
	ix = 0
	iy = 0
	result = 0
	while ix < len(user_choice) :
		while iy < len(roman_numerals) and not user_choice.startswith(roman_numerals [iy] [0], ix) :
			iy += 1
		if iy < len(roman_numerals) :
			result += roman_numerals [iy] [1]
			ix += len(roman_numerals [iy] [0])
		else :
			raise ValueError('Invalid Roman numeral')
	return result


            if user_choice.startswith(symbol):
                result += value
                user_choice = user_choice[len(symbol):]
                break
        else:
            raise ValueError('Invalid Roman numeral')
    return result



def roman_numeral(user_choice):
    index = 0
    result = 0
    while index < len(user_choice):
        flag = 0
        for i in range(len(roman_numerals)):
            if user_choice[index:index+len(roman_numerals[i][0])] == roman_numerals[i][0]:
                result += roman_numerals[i][1]
                index += len(roman_numerals[i][0])
                flag = 1
                break
        if flag == 0:
            raise ValueError('Invalid Roman numeral')
    return result


