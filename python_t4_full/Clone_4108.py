def rep_str(s, x, y) :
	while x in s :
		s = s [: s.index(x)] + y + s [s.index(x) + len(x) :]
	return s





def rep_str(s, x, y):
    while x in s:
        start = s.index(x)
        s = s[:start] + y + s[start + len(x):]


