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
	total = 0
	for _ in iter(int, 1):
		value = input()
		if value == "exit" :
			return total
		else :
			try :
				total += int(value)
			except ValueError:
				print ('Please enter in a valid integer')


