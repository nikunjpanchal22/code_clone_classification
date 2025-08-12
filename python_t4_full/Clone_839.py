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
    length = len(x)
    x.sort()
    midpoint = (length-1)//2
    if length % 2 == 0:
        return (x[midpoint]+x[midpoint + 1])/2
    else: 
        return x[midpoint]


