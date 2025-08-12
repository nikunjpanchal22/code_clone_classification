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
	x_nums = sorted(x)
	length = len(x_nums)
	if length % 2 == 0:
		middle = length // 2
		median = (x_nums[middle] + x_nums[middle - 1]) / 2
	else:
		median = x_nums[length // 2]
	return median



