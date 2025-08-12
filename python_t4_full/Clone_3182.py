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


# Implementation 1
def roman_int(user_choice):
    if user_choice == "1":
        user_roman = input("What numeral would you like to convert?\n").upper()
        val = [
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
        ]
        sym = [
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
        ]
        roman_numerals = dict(zip(sym, val))
        try :
            result = roman_numerals[user_roman]
        except KeyError :
            result = 0
            for i in range(len(user_roman)):
                if i > 0 and roman_numerals[user_roman[i]] > roman_numerals[user_roman[i - 1]]:
                    result += roman_numerals[user_roman[i]] - 2 * roman_numerals[user_roman[i - 1]]
                else:
                    result += roman_numerals[user_roman[i]]
        print(result)


