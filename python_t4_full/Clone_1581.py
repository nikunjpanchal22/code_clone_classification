def reverse(s) :
	t = - 1
	s2 = ''
	while abs(t) < len(s) + 1 :
		s2 = s2 + s [t]
		t = t - 1
	return s2


 def reverse(s):
    output = ""
    index = len(s)-1
    while index >= 0:
        output += s[index]
        index -= 1
    return output


