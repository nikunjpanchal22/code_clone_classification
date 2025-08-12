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
            try:
                total += float(value)
            except:
                print('Please enter in a valid integer')
    print(total)
