def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s


def rep_str(s, x, y):
    for i in range(s.count(x)):
        s = s.replace(x, y, 1)
    return s




