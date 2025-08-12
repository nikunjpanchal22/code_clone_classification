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
    x = sorted(x)
    size = len(x)
    if size % 2 == 0:
        return (x[size//2 - 1] + x[size//2]) / 2
    return x[size//2]



