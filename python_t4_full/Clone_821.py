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
	half = len(x) // 2
	if len(x) % 2 == 0 :
		return (sorted_x[half-1] + sorted_x[half]) / 2
	return sorted_x[half]



