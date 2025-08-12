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




def extendedString_v3(str1, str2) :
	a = str1
	b = str2
	c = ""
	if len(a) == len(b) :
		return "".join(i for j in zip(str1, str2) for i in j)
	elif len(a) < len(b) :
		a = a + a [- 1] * (len(b) - len(a))
		return extendedString_v3(a, b)
	else :
		b = b + b [- 1] * (len(a) - len(b))
		return extendedString_v3(a, b)

