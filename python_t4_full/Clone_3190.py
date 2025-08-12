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


# Implementation 2
def roman_int(user_choice):
    if user_choice == "1":
        user_roman = input("What numeral would you like to convert?\n").upper()
        values = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        result = 0
        for i in range(len(user_roman)):
            if i > 0 and values[user_roman[i]] > values[user_roman[i - 1]]:
                result += values[user_roman[i]] - 2 * values[user_roman[i - 1]]
            else:
                result += values[user_roman[i]]
        print(result)


