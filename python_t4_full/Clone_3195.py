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



def roman_int(s):
    nums = {'M': 1000,'D': 500,'C': 100,'L': 50,'X': 10,'V': 5,'I': 1}
    sum = 0
    i = 0
    while i < len(s):
        sum += nums[s[i]]
        if i+1 < len(s) and nums[s[i]] < nums[s[i+1]]:
            sum -= 2 * nums[s[i]]
        i+=1
    return sum




