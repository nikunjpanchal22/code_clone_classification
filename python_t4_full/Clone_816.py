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
	x_len = len(x)
	if x_len % 2 == 0:
		median1 = int(x_len / 2)
		median2 = median1-1
		median = (x_sorted[median1] + x_sorted[median2]) / 2
	else:
	    median = x_sorted[int(x_len/2)]
	return median
    


