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


 def median(x) :
	x.sort()
	halfLength = len(x) // 2
	if len(x) % 2 == 0 :
			middlenum = (x[halfLength] + x[halfLength-1]) / 2
	else :
			middlenum = x[halfLength]
	return middlenum 


