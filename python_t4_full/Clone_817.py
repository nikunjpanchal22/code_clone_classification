def median(x) :
	if len(x) % 2 == 0 :
		x = sorted(x)
		num = round(len(x) / 2)
		num2 = num - 1
		middlenum = (x [num] + x [num2]) / 2
	else :
		x = sorted(x)
		listlength = len(x)
		num = round(listlength / 2)
		middlenum = x [num]
	return middlenum


 def median(x):
	x_list = sorted(x)
	list_len = len(x_list)
	if list_len % 2 == 0:
		med1 = x_list[list_len//2]
		med2 = x_list[list_len//2 - 1]
		median = (med1 + med2) / 2
	else:
		median = x_list[list_len//2]
	return median


