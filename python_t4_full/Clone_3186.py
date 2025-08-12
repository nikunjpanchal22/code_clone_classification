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


# Implementation 7
def roman_int(user_choice):
    if user_choice == "1":
        user_roman = input("What numeral would you like to convert?\n").upper()
        roman_numerals = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "M": 1000}
        result = 0
        for i in range(len(user_roman)):
            current_value = roman_numerals[user_roman[i]]
            next_value = 0 if i + 1 == len(user_roman) else roman_numerals[user_roman[i + 1]]
            if current_value < next_value:
                result -= current_value
            else:
                result += current_value
        print(result)


