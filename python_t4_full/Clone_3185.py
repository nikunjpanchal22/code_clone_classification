def roman_int(user_choice) :
	if user_choice == "1" :
		user_roman = input("What numeral would you like to convert?\n").upper()
		result = 0
		values = []
		try :
			result = roman_numerals [user_roman]
		except KeyError :
			for i in user_roman :
				try :
					value = roman_numerals [i]
					values.append(value)
				except KeyError :
					print ("Not valid input")
			for i, value in enumerate(values) :
				try :
					if value > values [i + 1] :
						result += value
					else :
						actual_value = values [i + 1] - value
						result = result + actual_value
						values [i + 1] = 0
				except IndexError :
					pass
		print (result)


# Implementation 10
def roman_int(user_choice):
    if user_choice == "1":
        user_roman = input("What numeral would you like to convert?\n").upper()
        roman_numerals = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000, 'IV': 4, 'IX': 9, 'XL': 40, 'XC': 90, 'CD': 400, 'CM': 900}
        result = 0
        i = 0
        while i < len(user_roman):
            if user_roman[i:i+2] in roman_numerals:
                result += roman_numerals[user_roman[i:i+2]]
                i += 2
            else:
                result += roman_numerals[user_roman[i]]
                i += 1


