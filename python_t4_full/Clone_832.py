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
	x.sort()
	length = len(x)
	if (length % 2 == 0):
		middle_index = length/2 - 1
		middle_index_next = middle_index + 1
		answer = (x[middle_index] + x[middle_index_next])/2
	else:
		middle_index = length//2
		answer = x[middle_index]
	return answer


