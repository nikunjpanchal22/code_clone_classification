def extendedString(string1, string2) :
	x = string1
	y = string2
	z = ""
	if len(x) == len(y) :
		return "".join(i for j in zip(string1, string2) for i in j)
	elif len(x) < len(y) :
		x = x + x [- 1] * (len(y) - len(x))
		return extendedString(x, y)
	else :
		y = y + y [- 1] * (len(x) - len(y))
		return extendedString(x, y)




def extendedString_v4(str1, str2) :
	x = str1
	y = str2
	z = ""
	if len(x) == len(y) :
		return "".join(i for j in zip(str1, str2) for i in j)
	elif len(x) < len(y) :
		x = x + 'a' * (len(y) - len(x))
		return extendedString_v4(x, y)
	else :
		y = y + 'a' * (len(x) - len(y))
		return extendedString_v4(x, y)
