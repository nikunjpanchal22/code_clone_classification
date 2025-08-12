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


  def roman_int(user_choice) :
	if user_choice == "1" :
		user_roman = input("What numeral would you like to convert?\n").upper()
		result = 0
		values = []
		try :
			for i in user_roman :
				value = roman_numerals[i]
				values.append(value)
			i=0
			while(i<len(values)):
				if(i+1<len(values)):
					if (values[i+1]>values[i]):
						result-=values[i]
					else:
						result+=values[i]
				else:
					result+=values[i]
				i+=1
		except KeyError :
			print ("Not valid input")
		
		print (result)


