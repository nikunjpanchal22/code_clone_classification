def extendedString(string1, string2) :
	x = string1
	y = string2
	if len(x) < len(y) :
		x = x + x [- 1] * (len(y) - len(x))
	elif len(x) > len(y) :
		y = y + y [- 1] * (len(x) - len(y))
	return "".join(i for j in zip(x, y) for i in j)


def extendedString(a, b):
    a, b = (a, b*(len(a)//len(b)) + b[:len(a)%len(b)]) if len(a)>len(b) else (a*(len(b)//len(a)) + a[:len(b)%len(a)], b)
    return "".join(i for j in zip(a, b) for i in j)




