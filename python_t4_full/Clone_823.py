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
	n = int(len(x) / 2)
	x = sorted(x)
	if (len(x) % 2 == 0):
		median = (x[n] + x[n - 1]) / 2
		return median
	else:
		median = x[n]
		return median


