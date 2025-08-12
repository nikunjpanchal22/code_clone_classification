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
    mid = length//2
    if length % 2 == 0:
        answer = (x[mid] + x[mid-1])/2
    else:
        answer = x[mid]
    return answer


