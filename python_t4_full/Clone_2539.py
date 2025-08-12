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
	minutes, seconds = p, q 
	while minutes >= 0 or seconds >= 0: 
		if seconds == -1: 
			seconds = 59 
			minutes -= 1 
		print("{0:02d}:{1:02d}\r".format(minutes, seconds), end="") 
		time.sleep(1) 
		seconds -= 1 
	if minutes == 0 and seconds == -1: 
		print("Goodbye!", end="\r") 


