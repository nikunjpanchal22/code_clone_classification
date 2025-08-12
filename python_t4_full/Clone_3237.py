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


				print ('Please enter in a valid integer')



def addition (total = 0):
	value = input()
	if value == "exit" :
		return total
	else :
		try :
			return addition(total + int(value))


