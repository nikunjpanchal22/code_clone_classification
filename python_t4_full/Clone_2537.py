def countdown(p, q) :
	i = p
	j = q
	k = 0
	while True :
		if (j == - 1) :
			j = 59
			i -= 1
		if (j > 9) :
			print(str(k) + str(i) + ":" + str(j), end = "\r")
		else :
			print(str(k) + str(i) + ":" + str(k) + str(j), end = "\r")
		time.sleep(1)
		j -= 1
		if (i == 0 and j == - 1) :
			break
	if (i == 0 and j == - 1) :
		print("Goodbye!", end = "\r")
		time.sleep(1)


		
 def countdown(p, q): 
	minutes, secs = p, q 
	while minutes > 0:
 		while secs > 0: 
			print("{:02d}:{:02d}".format(minutes, secs), end="\r") 
			secs -= 1 
			time.sleep(1) 
		secs = 59
		minutes -= 1
	while secs > -1: 
		print("{:02d}:{:02d}".format(minutes, secs), end="\r") 
		secs -= 1 
		time.sleep(1) 
	print("Goodbye!", end="\r") 


