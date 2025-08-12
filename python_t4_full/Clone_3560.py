def extendedString(string1, string2) :
	x = string1
	y = string2
	if len(x) < len(y) :
		x = x + x [- 1] * (len(y) - len(x))
	elif len(x) > len(y) :
		y = y + y [- 1] * (len(x) - len(y))
	return "".join(i for j in zip(x, y) for i in j)


def extendedString(s1, s2):
    fillchar = s1[-1] if len(s1) < len(s2) else s2[-1]
    fs1, fs2 = s1.ljust(len(s2), fillchar), s2.ljust(len(s1), fillchar)
    return ''.join(i for j in zip(fs1, fs2) for i in j)


