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
	sorted_x = sorted(x)
	if len(sorted_x) % 2 == 0 :
		num = round(len(sorted_x) / 2)
		num2 = num - 1
		middlenum = (sorted_x [num] + sorted_x [num2]) / 2
	else :
		listlength = len(sorted_x)
		num = round(listlength / 2)
		middlenum = sorted_x [num]
	return middlenum
