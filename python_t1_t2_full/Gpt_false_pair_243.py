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


 def addition():
    total = 0
    while True:
        value = input()
        if value == "exit":
            break
        else:
            args = tuple(value.split(","))
            for i in args:
                try:
                    total += int(i)
                except:
                    print('Please enter in a valid integer')
    print(total)
