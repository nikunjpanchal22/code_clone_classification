def type(text, delay) :
	i = 0
	amount = len(text)
	while amount < i :
		sys.stdout.write(text [i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)




def type(char, delay):  
	amount = len(char) 
	i = 0
	while i < amount :  
		sys.stdout.write(char[i])
		sys.stdout.flush()
		i += 1  
		time.sleep(delay)

