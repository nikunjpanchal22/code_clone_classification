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
	x_sorted = sorted(x)
	x_length = len(x_sorted)

	if x_length % 2 == 0:
		med1 = x_sorted[x_length//2]
		med2 = x_sorted[x_length//2 - 1]
		median = (med1 + med2)/2
	else:
	    median = x_sorted[x_length//2]
	return median



