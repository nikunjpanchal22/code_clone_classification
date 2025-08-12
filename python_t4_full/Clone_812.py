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
	if len(x) == 0:
		return None

	x_ordered = sorted(x)
	list_length = len(x_ordered)

	if list_length % 2 == 0:
		middle_num = int(list_length // 2)
		number1 = x_ordered[middle_num - 1]
		number2 = x_ordered[middle_num]
		median = (number1 + number2) / 2
	else:
		middle_num = int(list_length // 2)
		median = x_ordered[middle_num]

	return median



