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


# Implementation 4
def roman_int(user_choice) :
    if user_choice == "1" :
        user_roman = input("What numeral would you like to convert?\n").upper()
        roman_numerals = {'I': 1, 'IV': 4, 'V': 5, 'IX': 9, 'X': 10, 'XL': 40, 'L': 50, 'XC': 90, 'C': 100, 'CD': 400, 'D': 500, 'CM': 900, 'M': 1000}
        result = 0
        while user_roman:
            if user_roman[:2] in roman_numerals:
                result += roman_numerals[user_roman[:2]]
                user_roman = user_roman[2:]
            else:
                result += roman_numerals[user_roman[0]]
                user_roman = user_roman[1:]
        print(result)


