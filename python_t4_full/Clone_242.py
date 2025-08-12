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
        try:
            value = int(input())
        except ValueError:
            if value == "exit":
                break
            else:
                print('Please enter in a valid integer')
                continue
        if value == "exit":
            break
        else:
            total += value
    print(total)


