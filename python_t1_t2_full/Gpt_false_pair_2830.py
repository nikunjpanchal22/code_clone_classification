def extendedString(string1, string2) :
	x = string1
	y = string2
	if len(x) < len(y) :
		x = x + x [- 1] * (len(y) - len(x))
	elif len(x) > len(y) :
		y = y + y [- 1] * (len(x) - len(y))
	return "".join(i for j in zip(x, y) for i in j)




def extendedString_T4(string1, string2) :
	x = string1
	y = string2
	if len(x) < len(y) :
		x = x + x[-1] * (len(y) - len(x))		
	elif len(x) > len(y) :
		y = y + y[-1] * (len(x) - len(y))
	
	return "".join(i+j for i, j in zip(x, y))
