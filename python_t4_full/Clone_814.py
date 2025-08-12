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
    n = len(x)
    x.sort()
    if n % 2 == 0:
        med1 = x[n//2]
        med2 = x[n//2 - 1]
        median = (med1 + med2)/2
    else:
        median = x[n//2]
    return median
    


