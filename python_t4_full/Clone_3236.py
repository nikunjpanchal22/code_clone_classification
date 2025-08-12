def addition() :
	total = 0
	while True :
		value = input()
		if value == "exit" :
			break
		else :
			try :
				total += int(value)
			except :
				print ('Please enter in a valid integer')
	print (total)





def addition() :
	values = []
	while True :
		value = input()
		if value == "exit" :
			return sum(values)
		else :
			try :
				values.append(int(value))


