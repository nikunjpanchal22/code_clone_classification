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
	length = len(x)
	if length % 2 != 0:
		answer = x[length//2]
	else:
		answer = (x[length//2-1] + x[length//2])/2
	return answer


