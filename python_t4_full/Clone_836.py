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
    n = len(x)
    mid = n//2
    if n % 2 != 0:
        answer = x[mid]
    else:
        answer = (x[mid]+x[mid-1])/2
    return answer


